package general.algorithms.mathematics;

import java.util.Scanner;

/**
 * 順列
 */
public class Permutation {
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
