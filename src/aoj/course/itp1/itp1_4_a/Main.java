package aoj.course.itp1.itp1_4_a;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int d = a / b;
        int r = a % b;
        double f = (double)a / b;
        System.out.println(d + " " + r + " " + String.format("%.5f",f));
    }
}
