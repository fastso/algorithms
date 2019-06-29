package atcoder.contest.abc132.b;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for(int i=1;i<n-1;i++) {
            if ((a[i] > a[i-1] && a[i] < a[i+1]) || (a[i] > a[i+1] && a[i] < a[i-1])) {
                sum++;
            }
        }

        System.out.println(sum);
    }
}
