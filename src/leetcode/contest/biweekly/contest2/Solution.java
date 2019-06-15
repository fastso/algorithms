package leetcode.contest.biweekly.contest2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String... args) {
        Solution sol = new Solution();

        //System.out.println(sol.sumOfDigits(new int[]{99,77,33,66,55}));
        System.out.println(Arrays.toString(sol.permute("{a,b}c{d,e}f")));
    }

    public List<String> list = new ArrayList<>();
    public String[] permute(String S) {
        char[] cs = S.toCharArray();
        permutation(cs, 0, null);
        String[] array = list.toArray(new String[list.size()]);
        return array;
    }

    public void permutation(char[] cs, int p, StringBuilder result) {
        if (p >= cs.length) {
            list.add(result.toString());
            return;
        }
        // common
        if (p==0) {
            result = new StringBuilder();
        }
        if (cs[p] != '{' && cs[p] != ',' && cs[p] != '}') {
            result.append(cs[p]);
            permutation(cs, p+1, result);
        } else{
            // no common
            List<String> sub = new ArrayList<>();
            while(cs[p] != '}') {
                if (cs[p] != '{' && cs[p] != ',' && cs[p] != '}') {
                    sub.add(String.valueOf(cs[p]));
                }
                p++;
            }
            Collections.sort(sub);
            for (String s : sub) {
                StringBuilder next = new StringBuilder(result.toString() + s);
                permutation(cs, p+1, next);
            }
        }

    }

    public int[][] highFive(int[][] items) {
        int[] ids = new int[1001];
        Arrays.fill(ids, -1);

        int n = 0;
        for (int i = 1; i < 1001; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < items.length; j++) {
                if (items[j][0] == i) {
                    list.add(items[j][1]);
                }
            }
            if (list.isEmpty()) continue;
            n++;
            Collections.sort(list, Collections.reverseOrder());
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                sum += list.get(j);
            }
            ids[i] = sum / 5;
        }

        int[][] result = new int[n][2];
        int p = 0;
        for (int i = 1; i < 1001; i++) {
            if (ids[i] == -1) continue;
            result[p][0] = i;
            result[p][1] = ids[i];
            p++;
        }
        return result;
    }


    public int sumOfDigits(int[] A) {
        Arrays.sort(A);
        int min = A[0];
        if (min == 100) {
            min = 1;
        } else if (min > 10) {
            int x = min % 10;
            int y = min / 10;
            min = x + y;
        }

        if (min % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

}