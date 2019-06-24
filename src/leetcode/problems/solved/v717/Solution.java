package leetcode.problems.solved.v717;

public class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        boolean isOne = false;
        for (int i=0;i<bits.length;i++) {
            if (bits[i] == 1) {
                i++;
                if (i == bits.length-1) isOne = false;
            } else {
                if (i == bits.length-1) isOne = true;
            }
        }
        return isOne;
    }
}