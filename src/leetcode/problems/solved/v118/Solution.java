package leetcode.problems.solved.v118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String... args) {
        System.out.println(new Solution().generate(5).toString());
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) return result;
        result.add(Arrays.asList(1));
        if (numRows == 1) return result;
        result.add(Arrays.asList(1, 1));
        if (numRows == 2) return result;

        for (int i = 2; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for (int j = 1; j < i; j++) {
                list.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
            }
            list.add(1);
            result.add(list);
        }

        return result;
    }
}