package atcoder.contest.abc118.b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<String> list = new ArrayList<>();

        String line01 = sc.nextLine();
        String[] items01 = line01.split(" ");
        for (int j=1;j<Integer.parseInt(items01[0])+1;j++) {
            list.add(items01[j]);
        }

        for (int i=1;i<n;i++) {
            String line = sc.nextLine();
            String[] items = line.split(" ");
            for(String s : list) {
                boolean exist = false;
                for (int j = 1; j < Integer.parseInt(items[0]) + 1; j++) {
                    if (s.equals(items[j])) {
                        exist = true;
                    }
                }
                if (!exist) list.remove(s);

                if (list.isEmpty()) {
                    System.out.println(list.size());
                    return;
                }
            }
        }

        // 出力
        System.out.println(list.size());
    }
}
