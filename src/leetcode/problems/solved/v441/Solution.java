package leetcode.problems.solved.v441;

public class Solution {
    public int arrangeCoins(int n) {
        int stair = 0;
        int sum = 0;

        for(int i=1;;i++) {
            sum += i;
            if (n < sum) break;
            stair++;
        }

        return stair;
    }
}