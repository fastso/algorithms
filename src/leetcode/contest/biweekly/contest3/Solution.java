package leetcode.contest.biweekly.contest3;

public class Solution {
    public static void main(String... args) {
        Solution sol = new Solution();

//        System.out.println(sol.twoSumLessThanK(new int[]{10,20,30}, 15));
//        System.out.println(sol.numKLenSubstrNoRepeats("havefunonleetcode", 5));
//        System.out.println(sol.maximumMinimumPath(new int[][]{{5,4,5},{1,2,6},{7,4,6}}));
//        System.out.println(sol.maximumMinimumPath(new int[][]{{2, 2, 1, 2, 2, 2}, {1, 2, 2, 2, 1, 2}}));
        System.out.println(sol.maximumMinimumPath(new int[][]{{2,0,2,3,1},{0,2,2,3,3},{2,3,0,2,3},{1,1,2,3,1},{2,2,0,0,1}}));
    }

    public int maximumMinimumPath(int[][] A) {
        int i = 0;
        int j = 0;
        int x = A.length;
        int y = A[0].length;

        int result = Integer.MAX_VALUE;

        int[] pre = new int[]{0, 0};
        while (!(i == x - 1 && j == y - 1)) {
            System.out.println("(" + i + "," + j + "):" + A[i][j]);
            if (A[i][j] < result) result = A[i][j];

            // 左下右上
            int[] next = new int[]{-1, -1, -1, -1};
            if (!(i + 1 == pre[0] && j == pre[1]) && i + 1 < x) next[0] = A[i + 1][j];
            if (!(i == pre[0] && j + 1 == pre[1]) && j + 1 < y) next[1] = A[i][j + 1];
            if (!(i - 1 == pre[0] && j == pre[1]) && i - 1 >= 0) next[2] = A[i - 1][j];
            if (!(i == pre[0] && j - 1 == pre[1]) && j - 1 >= 0) next[3] = A[i][j - 1];

            int flag = -1;
            int max = -1;
            for (int m = 0; m < 4; m++) {
                if (next[m] > max) {
                    max = next[m];
                    flag = m;
                }
            }

            pre[0] = i;
            pre[1] = j;

            switch (flag) {
                case 0:
                    i += 1;
                    break;
                case 1:
                    j += 1;
                    break;
                case 2:
                    i -= 1;
                    break;
                case 3:
                    j -= 1;
                    break;
            }
        }
        if (A[A.length - 1][A[0].length - 1] < result) result = A[A.length][A[0].length];
        return result;
    }


    public int earliestAcq(int[][] logs, int N) {
        return 1;
    }


    public int numKLenSubstrNoRepeats(String S, int K) {
        int result = 0;
        for (int i = 0; i < S.length() - K + 1; i++) {
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < K; j++) {
                if (sb.toString().contains(String.valueOf(S.charAt(i + j)))) {
                    break;
                }
                sb.append(S.charAt(i + j));
            }
            if (sb.length() == K) {
                result++;
                System.out.println(sb.toString());
            }
        }
        return result;
    }

    public int twoSumLessThanK(int[] A, int K) {
        int S = -1;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] + A[j] < K && A[i] + A[j] > S) {
                    S = A[i] + A[j];
                }
            }
        }
        return S;
    }

}