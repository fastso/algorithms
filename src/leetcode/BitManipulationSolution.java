package leetcode;

public class BitManipulationSolution {
    public static void main(String... args) {

    }

    public int countPrimeSetBits(int L, int R) {
        int count = 0;
        for (int i = L; i <= R; i++) {
            int temp = Integer.bitCount(i);
            if (isPrime(temp)) count++;
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
