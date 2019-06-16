package atcoder.contest.abc130.c;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x == w / 2.0 && y == h / 2.0) {
            System.out.println(w * h / 2.0 + " " + 1);
        } else if (x == w / 2.0) {
            System.out.println(w * h / 2.0 + " " + 0);
        } else if (y == h / 2.0) {
            System.out.println(w * h / 2.0 + " " + 0);
        } else if (x == w || y == h) {
            System.out.println(w * h / 2.0 + " " + 0);
        } else if (x == 0 || y == 0) {
            System.out.println(w * h / 2.0 + " " + 0);
        } else if (x/y == w/h || (w-x)/y == w/h) {
            System.out.println(w * h / 2.0 + " " + 0);
        } else {
            System.out.println(w * h / 2.0 + " " + 0);
        }
    }
}
