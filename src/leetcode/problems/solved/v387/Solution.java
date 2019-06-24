package leetcode.problems.solved.v387;

public class Solution {
    public static void main(String... args) {
        System.out.println(new Solution().firstUniqChar("cc"));
    }

    public int firstUniqChar(String s) {
        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (s.lastIndexOf(c) == s.indexOf(c)) return i;
        }
        return -1;
    }
}