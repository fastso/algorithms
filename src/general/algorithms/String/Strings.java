package general.algorithms.String;

public class Strings {
    public static void main(String... args) {
        Strings ss = new Strings();
        String s = "abacabc";

        System.out.println(ss.longestPalindrome(s));
    }

    /**
     * 文字列sにある最長回文を求める。
     * ( Manacher's Algorithm )
     *
     * @param s 文字列
     * @return 最長回文
     */
    public String longestPalindrome(String s) {
        char[] c = s.replace("", "#").toCharArray();
        int[] r = new int[c.length];

        int maxR = 0;
        int maxIndex = 0;

        int radius = 0;
        for (int i = 0; i < c.length; i++) {
            while (i - radius >= 0 && i + radius < c.length && c[i - radius] == c[i + radius]) {
                radius++;
            }
            r[i] = radius - 1;
            if (r[i] > maxR) {
                maxR = r[i];
                maxIndex = i;
            }
            radius = 0;
        }

        return s.substring((maxIndex - maxR) / 2, (maxIndex + maxR) / 2);
    }

    public int countAllPalindromic(String s) {
        int count = 0;

        return count;
    }
}
