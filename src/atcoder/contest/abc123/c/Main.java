package atcoder.contest.abc123.c;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        long[] x = new long[5];
        long n = sc.nextLong();
        if (n==9) System.out.println(0);
        x[0] = sc.nextLong();
        x[1] = sc.nextLong();
        x[2] = sc.nextLong();
        x[3] = sc.nextLong();
        x[4] = sc.nextLong();
        long count = 0;

        Arrays.sort(x);
        if (n % x[0] == 0) {
            count = n / x[0];
        } else {
            count = n / x[0] + 1;
        }
        count += 4;

        System.out.println(count);
    }
}
