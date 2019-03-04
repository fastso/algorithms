package atcoder.contest.abc120.c;

import java.util.Scanner;

public class MainAnswer {
    public static void main(String... args) {
        long start = System.currentTimeMillis();

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        char[] ch = s.toCharArray();
        int ch0 = 0;
        int ch1 = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '0') {
                ch0++;
            } else {
                ch1++;
            }
        }
        System.out.println(Math.min(ch0, ch1) * 2);

        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");
    }
}
