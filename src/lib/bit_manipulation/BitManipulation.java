package lib.bit_manipulation;

public class BitManipulation {
    public static void main(String... args) {
        BitManipulation bm = new BitManipulation();
    }

    /**
     * nのビット列を反転する。
     *
     * @param n int
     * @return int
     */
    public static int reverseBits(int n) {
        return ~n;
    }

    /**
     * nのビット列は1と0が交互に現れるかを判定する。
     * <p>
     * n =         1 0 1 0 1 0 1 0
     * n >> 1      0 1 0 1 0 1 0 1
     * n ^ n>>1    1 1 1 1 1 1 1 1
     * n           1 1 1 1 1 1 1 1
     * n + 1     1 0 0 0 0 0 0 0 0
     * n & (n+1)   0 0 0 0 0 0 0 0
     *
     * @param n int
     * @return boolean
     */
    public static boolean hasAlternatingBits(int n) {
        n = n ^ (n >> 1);
        return (n & n + 1) == 0;
    }
}
