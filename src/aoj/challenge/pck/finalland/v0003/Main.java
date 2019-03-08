package aoj.challenge.pck.finalland.v0003;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] side = new int[3];

        for (int i = 0; i < n; i++) {
            side[0] = sc.nextInt();
            side[1] = sc.nextInt();
            side[2] = sc.nextInt();

            Arrays.sort(side);

            if (side[0] * side[0] + side[1] * side[1] == side[2] * side[2]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
