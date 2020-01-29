package lib.mathematics;

import java.util.Scanner;

/**
 * 素数
 */
public class PrimeNumbers {
    public static void main(String... args) {
    }

    /**
     * n以下の素数を数える。
     *
     * @param n int
     * @return int
     */
    public static int countPrimes(int n) {
        // boolean[] are initialed as false by default
        boolean[] isNotPrimes = new boolean[n + 1];

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!isNotPrimes[i]) {
                count++;
                for (int j = 2; i * j < n; j++) {
                    isNotPrimes[i * j] = true;
                }
            }
        }
        return count;
    }

    /**
     * nが素数か否かを判定する。
     *
     * @param n int
     * @return boolean
     */
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
