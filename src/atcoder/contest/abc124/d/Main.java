package atcoder.contest.abc124.d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();

        char[] c = s.toCharArray();

        List<Integer> lenList = new ArrayList<>();
        int l = 0;
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                l++;
                lenList.add(l);
                continue;
            }
            if (c[i] != c[i + 1]) {
                l++;
                lenList.add(l);
                l = 0;
                continue;
            }
            l++;
        }

        List<Integer> maxList = new ArrayList<>();
        int max = 0;
        if (c[0] == '1') {
            boolean is = false;
            for (int i=0;i<lenList.size();i+=2) {
                for(int j=0;j<k;j++){
                    if (i+j >= lenList.size()) {
                        is = true;
                        break;
                    }
                    max += lenList.indexOf(i+j);
                    if (i+j+1 >= lenList.size()) {
                        is = true;
                        break;
                    }
                    max += lenList.indexOf(i+j+1);
                }
                maxList.add(max);
                max = 0;
                if (is) break;
            }
        }


//        for (int i = 0; i < c.length; i++) {
//            int k = K;
//            if (i != 0 && c[i - 1] == '1' && c[i] == '1') {
//                continue;
//            }
//            if (c[i] == '0' && i == 0) {
//                k--;
//            } else if (c[i] == '0') {
//                continue;
//            }
//
//            for (int j = i; j < c.length; j++) {
//                if (c[j] == '1') len[i]++;
//                if (c[j] == '0') {
//                    if (j != 0 && c[j - 1] == '1') {
//                        k--;
//                        if (k < 0) {
//                            break;
//                        } else {
//                            len[i]++;
//                        }
//                    } else {
//                        len[i]++;
//                    }
//                }
//            }
//        }
//
//        Arrays.sort(len);

        System.out.println();
    }
}
