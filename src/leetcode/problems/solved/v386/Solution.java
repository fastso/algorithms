package leetcode.problems.solved.v386;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String... args) {
        System.out.println(new Solution().lexicalOrder(5000000));
    }

    public List<Integer> lexicalOrder(int n) {
        String[] a = new String[n];
        for (int i = 1; i <= n; i++) {
            a[i-1] = String.valueOf(i);
        }

        Arrays.sort(a);

        List<Integer> list = new ArrayList<>();
        for (String s : a) {
            list.add(Integer.parseInt(s));
        }
        return list;
    }
}