package atcoder.template;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String line01 = sc.nextLine();
        String[] items = line01.split(" ");
        String line02 = sc.nextLine();
        int[] q = new int[n];

        for (int i = 0; i < n; i++) {
            int item = Integer.parseInt(items[i]);
            q[i] = item;
        }

        // 文字列の入力
        // String s = sc.next();

        // 処理
        int result = 0;

        // 出力
        System.out.println(result);
    }
}
