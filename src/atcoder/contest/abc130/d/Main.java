package atcoder.contest.abc130.d;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        long sum = a[0];
        int end = 1;
        int result = 0;

        for (int i = 0; i < n; i++) {
            if (i > 0) sum -= a[i - 1];
            if (sum >= k) {
                result += n - end + 1;
                continue;
            }

            if (end >= n) break;
            boolean flag = true;
            for (int j = end; j < n; j++) {
                sum += a[j];
                if (sum >= k) {
                    end = j + 1;
                    result += n - j;
                    flag = false;
                    break;
                }
            }
            if (flag) break;
        }

        System.out.println(result);
    }
}
