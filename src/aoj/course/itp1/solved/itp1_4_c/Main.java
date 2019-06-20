package aoj.course.itp1.solved.itp1_4_c;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();

            if ("?".equals(op)) break;

            switch (op) {
                case "+":
                    System.out.println(a+b);
                    break;
                case "-":
                    System.out.println(a-b);
                    break;
                case "*":
                    System.out.println(a*b);
                    break;
                case "/":
                    System.out.println(a/b);
                    break;
            }
        }
    }
}
