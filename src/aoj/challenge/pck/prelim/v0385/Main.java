package aoj.challenge.pck.prelim.v0385;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }


        int[] aSort = a.clone();
        Arrays.sort(aSort);
        if (Arrays.equals(a, aSort)) {
            System.out.println(0);
            return;
        }

        int q = sc.nextInt();
        for (int i=0;i<q;i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int temp = a[x-1];
            a[x-1] = a[y-1];
            a[y-1] = temp;
            if (Arrays.equals(a,aSort)) {
                System.out.println(i+1);
                return;
            }
        }

        System.out.println(-1);
    }
}
