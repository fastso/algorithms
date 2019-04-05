package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String... args) {
        Solution sol = new Solution();

//        int[] A = {2,1,2,5,3,2};
//        System.out.println(sol.repeatedNTimes(A));

//        System.out.println(sol.hammingDistance(1, 4));

//        System.out.println(sol.selfDividingNumbers(25, 25));
//        System.out.println(sol.prefixesDivBy5(new int[]{0,1,1,1,1,1}));
//        System.out.println(Arrays.toString(sol.sortArrayByParityII(new int[]{4,2,5,7})));
//        System.out.println(sol.findComplement(5));
        System.out.println(sol.toGoatLatin("I speak Goat Latin"));
    }

    public String toGoatLatin(String S) {
        String[] arr = S.split(" ");
        StringBuilder result = new StringBuilder();
        StringBuilder a = new StringBuilder();

        for (int i=0;i<arr.length;i++) {
            a.append("a");
            char[] c = arr[i].toCharArray();
            if (c[0] == 'a' || c[0] == 'i' || c[0] == 'u' || c[0] == 'e' || c[0] == 'o'
            || c[0] == 'A' || c[0] == 'I' || c[0] == 'U' || c[0] == 'E' || c[0] == 'O') {
                result.append(arr[i]).append("ma").append(a).append(" ");
            } else {
                char temp = c[0];
                result.append(String.valueOf(c).substring(1)).append(temp).append("ma").append(a).append(" ");
            }
        }
        return result.deleteCharAt(result.length()-1).toString();
    }

    public int findComplement(int num) {
        return ~num & ((Integer.highestOneBit(num) << 1) - 1);
    }

    public int[] sortArrayByParityII(int[] A) {
        int[] odd = new int[A.length/2];
        int[] even = new int[A.length/2];

        int o=0;
        int e=0;
        for (int i=0;i<A.length;i++) {
            if (A[i]%2 == 0) {
                odd[o++] = A[i];
            } else {
                even[e++] = A[i];
            }
        }

        for (int i=0;i<A.length;i+=2) {
            A[i] = odd[i/2];
            A[i+1] = even[i/2];
        }

        return A;
    }

    public int arrayPairSum(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i+=2) {
            result += nums[i];
        }
        return result;
    }

    /**
     * 1010または101または1111
     *
     * @param A
     * @return
     */
    public List<Boolean> prefixesDivBy5(int[] A) {
        int x = 0;
        List<Boolean> list = new ArrayList<>();
        for (int a : A) {
            x = (x << 1 | a) % 5;
            list.add(x == 0);
        }
        return list;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        int[] l = new int[5];
        int temp = left;

        Arrays.fill(l, -1);

        for (int i = 0; i < 5; i++) {
            l[i] = temp % 10;
            temp /= 10;
            if (temp == 0) break;
            if (temp < 10) {
                l[i + 1] = temp;
                break;
            }
        }

        boolean b = true;
        for (int i = 0; i < 5; i++) {
            if (l[i] == -1) break;
            if (l[i] == 0 || left % l[i] != 0) {
                b = false;
                break;
            }
        }
        if (b) list.add(left);

        for (int i = left + 1; i <= right; i++) {
            if (l[0] + 1 > 9) {
                l[0] = 0;
                if (l[1] + 1 > 9) {
                    l[1] = 0;
                    if (l[2] + 1 > 9) {
                        l[2] = 0;
                        if (l[3] + 1 > 9) {
                            l[3] = 0;
                            l[4] = 1;
                            continue;
                        } else {
                            if (l[3] == -1) l[3] = 1;
                            else l[3]++;
                        }
                        continue;
                    } else {
                        if (l[2] == -1) l[2] = 1;
                        else l[2]++;
                    }
                    continue;
                } else {
                    if (l[1] == -1) l[1] = 1;
                    else l[1]++;
                }
                continue;
            } else {
                l[0]++;
            }

            b = true;
            for (int j = 0; j < 5; j++) {
                if (l[j] == -1) break;
                if (l[j] == 0 || i % l[j] != 0) {
                    b = false;
                    break;
                }
            }
            if (b) list.add(i);
        }

        return list;
    }

    public int hammingDistance(int x, int y) {
        char[] xc = Integer.toBinaryString(x).toCharArray();
        char[] yc = Integer.toBinaryString(y).toCharArray();
        int d = 0;

        for (int i = xc.length - 1, j = yc.length - 1; i >= 0 || j >= 0; i--, j--) {
            if (i < 0) {
                if (yc[j] == '1') {
                    d++;
                }
                continue;
            } else if (j < 0) {
                if (xc[i] == '1') {
                    d++;
                }
                continue;
            }
            if (xc[i] != yc[j]) {
                d++;
            }
        }
        return d;
    }

    public int[] diStringMatch(String S) {
        char[] c = S.toCharArray();
        int[] result = new int[S.length() + 1];
        int min = 0;
        int max = S.length();

        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'I') {
                result[i] = min;
                min++;
                if (i == c.length - 1) result[c.length] = min;
            } else {
                result[i] = max;
                max--;
                if (i == c.length - 1) result[c.length] = max;
            }
        }
        return result;
    }


    public int repeatedNTimes(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : A) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (int k : map.keySet()) {
            if (map.get(k) > 1) return k;
        }
        return 0;
    }
}
