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

        System.out.println(sol.selfDividingNumbers(25, 25));
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
