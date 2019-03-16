package atcoder.contest.agc031.a;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int max = 0;
        for (int i = 0; i < n - 1; i++) {
            int count = 0;
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(i));
            count++;
            for (int j = i + 1; j < n; j++) {
                int index = sb.indexOf(String.valueOf(s.charAt(j)));
                if (index == -1) {
                    sb.append(s.charAt(j));
                    count++;
                    if (count > max) max = count;
                } else {
                    i = index + 1;
                    count = 0;
                    break;
                }
            }
            if (max >= 26) break;
        }

        long ncr = 0;
        for (int i = 1; i <= max; i++) {
            ncr += nCr(max, i);
        }

        ncr = 1000000007 % ncr;
        System.out.println(ncr);
    }

    static long nCr(int n, int r) {
        long num = 1;
        for (int i = 1; i <= r; i++) {
            num = num * (n - i + 1) / i;
        }
        return num;
    }

}
