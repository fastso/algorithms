package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String... args) {
        Solution sol = new Solution();

//        int[] A = {2,1,2,5,3,2};
//        System.out.println(sol.repeatedNTimes(A));

        System.out.println(sol.hammingDistance(1, 4));
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
