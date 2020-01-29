package lib.bit_manipulation;

public class HammingDistance {
    public static void main(String... args) {
        HammingDistance hd = new HammingDistance();
        System.out.println(hd.hammingDistance(1,4));
    }

    /**
     * xとyのbit列のhamming distanceを求める。
     * 例: 001 and 100 is 2.
     *
     * @param x int
     * @param y int
     * @return hamming distance
     */
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
