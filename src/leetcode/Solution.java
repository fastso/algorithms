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
//        System.out.println(sol.toGoatLatin("I speak Goat Latin"));
//        System.out.println(sol.rotatedDigits(857));
//        System.out.println(sol.commonChars(new String[]{"cool", "lock", "cook"}));
//        System.out.println(sol.isMonotonic(new int[]{1,2,1,4}));
//        System.out.println(Arrays.toString(sol.twoSum(new int[]{0, 0, 3, 4}, 0)));
        System.out.println(sol.thirdMax(new int[]{1, 2}));
    }

    public int thirdMax(int[] nums) {
        int[] arr = Arrays.stream(nums).distinct().sorted().toArray();

        return arr.length < 3 ? arr[arr.length - 1] : arr[arr.length - 3];
    }

    public int[][] imageSmoother(int[][] M) {
        int result[][] = new int[M.length][M[0].length];
        int sum = 0;
        int n = 0;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                sum = 0;
                n = 0;
                if (i - 1 >= 0) {
                    if (j - 1 >= 0) {
                        sum += M[i - 1][j - 1];
                        n++;
                    }
                    sum += M[i - 1][j];
                    n++;
                    if (j + 1 < M[0].length) {
                        sum += M[i - 1][j + 1];
                        n++;
                    }
                }

                if (j - 1 >= 0) {
                    sum += M[i][j - 1];
                    n++;
                }
                sum += M[i][j];
                n++;
                if (j + 1 < M[0].length) {
                    sum += M[i][j + 1];
                    n++;
                }

                if (i + 1 < M.length) {
                    if (j - 1 >= 0) {
                        sum += M[i + 1][j - 1];
                        n++;
                    }
                    sum += M[i + 1][j];
                    n++;
                    if (j + 1 < M[0].length) {
                        sum += M[i + 1][j + 1];
                        n++;
                    }
                }

                result[i][j] = sum / n;
            }
        }

        return result;
    }

    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[]{};
    }

    public boolean isMonotonic(int[] A) {
        int less = 0;
        int more = 0;

        if (A.length == 1) return true;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == A[i + 1]) {
                continue;
            } else if (A[i] < A[i + 1]) {
                more++;
            } else {
                less++;
            }

            if (more > 0 && less > 0) return false;
        }
        return true;
    }

    public List<String> commonChars(String[] A) {
        List<String> result = new ArrayList<>();
        String[] s = A[0].split("");
        for (int i = 0; i < s.length; i++) {
            int count = 1;
            for (int j = 1; j < A.length; j++) {
                if (A[j].contains(s[i])) {
                    count++;
                    A[j] = A[j].replaceFirst(s[i], "");
                }
            }
            if (count == A.length) result.add(s[i]);
        }
        return result;
    }

    public int rotatedDigits(int N) {
        String s = null;
        int count = 0;
        for (int i = 1; i <= N; i++) {
            s = String.valueOf(i);
            if (s.contains("3") || s.contains("4") || s.contains("7")) {
                continue;
            } else if (s.contains("2") || s.contains("5") || s.contains("6") || s.contains("9")) {
                count++;
            }
        }
        return count;
    }

    public String toGoatLatin(String S) {
        String[] arr = S.split(" ");
        StringBuilder result = new StringBuilder();
        StringBuilder a = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
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
        return result.deleteCharAt(result.length() - 1).toString();
    }

    public int findComplement(int num) {
        return ~num & ((Integer.highestOneBit(num) << 1) - 1);
    }

    public int[] sortArrayByParityII(int[] A) {
        int[] odd = new int[A.length / 2];
        int[] even = new int[A.length / 2];

        int o = 0;
        int e = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                odd[o++] = A[i];
            } else {
                even[e++] = A[i];
            }
        }

        for (int i = 0; i < A.length; i += 2) {
            A[i] = odd[i / 2];
            A[i + 1] = even[i / 2];
        }

        return A;
    }

    public int arrayPairSum(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
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
