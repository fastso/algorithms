package general.algorithms.mathematics.permutation;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        System.out.println(nPr(n, r));
    }

    static long nPr(int n, int r) {
        long num = 1;
        for (int i = n; i > (n - r); i--) {
            num *= i;
        }
        return num;
    }
}
