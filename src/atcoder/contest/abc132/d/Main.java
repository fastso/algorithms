package atcoder.contest.abc132.d;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[k + 1];

        for (int i = 1; i <= k; i++) {
            if (i == 1) {
                a[i] = nCr(n-k+1, i)%1000000007;
            } else {
                a[i] = (nCr(n-k+1, i)%1000000007) * (nCr(k-1,i-1)%1000000007);
                a[i] %= 1000000007;
            }
            System.out.println(a[i]);
        }

    }

    public static long nCr(int n, int r) {
        long num = 1;
        for (int i = 1; i <= r; i++) {
            num = num * (n - i + 1) / i % 1000000007;
        }
        return num;
    }
}
