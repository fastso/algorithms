package general.algorithms.mathematics;

import java.util.Arrays;
import java.util.Scanner;

public class Combination {
    public static void main(String... args) {
        Combination cb = new Combination();

        // nCrテスト
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int r = sc.nextInt();
//
//        System.out.println(cb.nCr(n, r));

        // printCombinationテスト
        cb.printCombination(3);
    }

    /**
     * 組合せ数を返します。
     *
     * @param n 総件数
     * @param r 組合せ対象数
     * @return 組合せ数
     */
    public long nCr(int n, int r) {
        long num = 1;
        for (int i = 1; i <= r; i++) {
            num = num * (n - i + 1) / i;
        }
        return num;
    }

    public void printCombination(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = 0;
        }
        rec(0,n,arr);
    }

    public void rec(int i, int n, int[] arr) {
        if (i == n) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        rec(i + 1, n, arr);
        arr[i] = 1;
        rec(i + 1, n, arr);
        arr[i] = 0;
    }
}
