package aoj.challenge.pck.prelim.v0385;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
//    public static void main(String... args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//
//
//        int[] aSort = a.clone();
//        Arrays.sort(aSort);
//        if (Arrays.equals(a, aSort)) {
//            System.out.println(0);
//            return;
//        }
//
//        int q = sc.nextInt();
//        int prex = 0;
//        int prey = 0;
//        for (int i = 0; i < q-1; i+=2) {
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            int xNext =sc.nextInt();
//            int yNext =sc.nextInt();
//
//            if (xNext == x && yNext == y) continue;
//
//            int temp = a[x - 1];
//            a[x - 1] = a[y - 1];
//            a[y - 1] = temp;
//
//            if (isSort(a, aSort)) {
//                System.out.println(i + 1);
//                return;
//            }
//
//            temp = a[xNext - 1];
//            a[xNext - 1] = a[yNext - 1];
//            a[yNext - 1] = temp;
//
//            if (isSort(a, aSort)) {
//                System.out.println(i + 2);
//                return;
//            }
//        }
//
//        System.out.println(-1);
//    }

//    static boolean isSort(int[] a, int[] sort) {
//        for (int j = 0; j < a.length; j++) {
//            if (a[j] != sort[j]) return false;
//        }
//        return true;
//    }

    int N, diff;
    int[] A;
    Scanner sc;

    void update(int i, int v){
        int d1 = 0, d2 = 0;
        if ( A[i-1] > A[i] ) d1++;
        if ( A[i] > A[i+1] ) d1++;
        A[i] = v;
        if ( A[i-1] > A[i] ) d2++;
        if ( A[i] > A[i+1] ) d2++;
        diff += (d2 - d1);
    }

    void activate(){
        sc = new Scanner(System.in);
        N = sc.nextInt();
        A = new int[N+2];
        for ( int i = 1; i <= N; i++ ) A[i] = sc.nextInt();
        A[0] = Integer.MIN_VALUE;
        A[N+1] = Integer.MAX_VALUE;
        System.out.println(solve());
    }


    int solve(){
        int a, b, q, v1, v2;
        diff = 0;
        for ( int i = 1; i <= N; i++ ) {
            if ( A[i-1] > A[i] ) diff++;
        }
        if ( diff == 0 ) return 0;
        q = sc.nextInt();
        for ( int i = 1; i <= q; i++ ){
            a = sc.nextInt();
            b = sc.nextInt();
            v1 = A[a];
            v2 = A[b];
            update(a, v2);
            update(b, v1);
            if ( diff == 0 ) return i;
        }

        return -1;
    }

    public static void main(String[] args){ new Main().activate(); }
}
