package atcoder.contest.abc131.a;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for(int i=1;i<s.length();i++) {
            if(s.charAt(i) == s.charAt(i-1)) {
                System.out.print("Bad");
                return;
            }
        }
        System.out.println("Good");
    }
}
