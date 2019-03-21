package general.algorithms.mathematics.prime_number;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(new Main().countPrimes(n));
    }

    public int countPrimes(int n) {
        // boolean[] are initialed as false by default
        boolean[] isNotPrimes = new boolean[n+1];

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
}
