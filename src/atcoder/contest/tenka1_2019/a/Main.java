package atcoder.contest.tenka1_2019.a;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b || b == c) {
            System.out.print("No");
            return;
        }
        if (a > b && b > c) System.out.print("No");
        else if (a < b && b < c) System.out.print("No");
        else System.out.print("Yes");
    }
}