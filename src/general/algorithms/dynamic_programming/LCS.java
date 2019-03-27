package general.algorithms.dynamic_programming;

public class LCS {
    public static void main(String... args) {
        LCS lcs = new LCS();
        String s1 = "abcbdab";
        String s2 = "bdcaba";

        System.out.println(lcs.lcs(s1, s2));
    }

    /**
     * 最長共通部分列(Longest Common Sub-sequence)を求める。
     *
     * @param s1 文字列
     * @param s2 文字列
     * @return lcs
     */
    public int lcs(String s1, String s2) {
        char[] x = (" " + s1).toCharArray();
        char[] y = (" " + s2).toCharArray();
        int[][] c = new int[x.length + 1][y.length + 1];
        for (int i = 0; i < x.length + 1; i++) c[i][0] = 0;
        for (int j = 0; j < y.length + 1; j++) c[0][j] = 0;

        int maxLen = 0;

        for (int i = 1; i < x.length; i++) {
            for (int j = 1; j < y.length; j++) {
                if (x[i] == y[j]) {
                    c[i][j] = c[i - 1][j - 1] + 1;
                } else {
                    c[i][j] = Math.max(c[i - 1][j], c[i][j - 1]);
                }
                maxLen = Math.max(maxLen, c[i][j]);
            }
        }
        return maxLen;
    }
}
