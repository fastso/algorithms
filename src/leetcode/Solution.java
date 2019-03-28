package leetcode;

import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    public static void main(String... args) {
        Solution sol = new Solution();

//        int[] A = {2,1,2,5,3,2};
//        System.out.println(sol.repeatedNTimes(A));

        System.out.println(sol.judgeCircle("LDRRLRUULR"));
    }

    public boolean judgeCircle(String moves) {
        int rl = 0;
        int ud = 0;

        char[] cMoves = moves.toCharArray();
        for (char c : cMoves) {
            switch (c) {
                case 'U' :
                    ud++;
                    break;
                case 'D' :
                    ud--;
                    break;
                case 'L' :
                    rl++;
                    break;
                case 'R' :
                    rl--;
                    break;
            }
        }
        if (rl == 0 && ud == 0) return true;
        else return false;
    }

    public int repeatedNTimes(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : A) {
            map.put(x, map.getOrDefault(x,0)+1);
        }

        for (int k:map.keySet()) {
            if (map.get(k) > 1) return k;
        }
        return 0;
    }
}
