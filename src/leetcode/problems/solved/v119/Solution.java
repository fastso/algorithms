package leetcode.problems.solved.v119;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String... args) {
        System.out.println(new Solution().getRow(3));
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        if (rowIndex < 0) return list;

        for (int i = 0; i < rowIndex + 1; i++) {
            list.add(0, 1);
            for (int j = 1; j < list.size() - 1; j++) {
                list.set(j, list.get(j) + list.get(j + 1));
            }
        }
        return list;
    }

    // TLE solution
//    public List<Integer> getRow(int rowIndex) {
//        List<Integer> result = new ArrayList<>();
//        for(int i=0;i<=rowIndex;i++) {
//            result.add(pascal(rowIndex,i));
//        }
//        return result;
//    }
//
//    public static int pascal(int i, int j) {
//        if (j==0 || j==i) return 1;
//        return pascal(i-1,j-1) + pascal(i-1,j);
//    }
}