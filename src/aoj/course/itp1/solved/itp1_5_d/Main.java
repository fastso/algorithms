package aoj.course.itp1.solved.itp1_5_d;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.print(" " + i);
                continue;
            }

            int x = i;
            while (x != 0) {
                if (x % 10 == 3) {
                    System.out.print(" " + i);
                    break;
                }
                x /= 10;
            }

        }
        System.out.println();
    }
}
