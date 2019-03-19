package leetcode.problems.v67;

import java.util.Scanner;

public class Solution {
    public String addBinary(String a, String b) {
        long ia = Long.parseLong(a, 2);
        long ib = Long.parseLong(b, 2);

        return Long.toBinaryString(ia + ib);
    }
}

class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        Solution s = new Solution();
        System.out.println(s.addBinary(a, b));
    }
}
