package general.algorithms.mathematics.gcd;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));
    }

    /**
     * aとbの最大公約数を計算する。
     *
     * @param a
     * @param b
     * @return
     */
    static long gcd(long a, long b) {
        if (a < b) return gcd(b, a);
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    /**
     * aとbの最大公倍数を計算する。
     *
     * @param a
     * @param b
     * @return
     */
    static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }
}
