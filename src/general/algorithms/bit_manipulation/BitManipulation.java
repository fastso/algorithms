package general.algorithms.bit_manipulation;

public class BitManipulation {
    public static void main(String... args) {
        BitManipulation bm = new BitManipulation();

        System.out.println(bm.reverseBits(4));
    }

    public int reverseBits(int n) {
        return ~n;
    }
}
