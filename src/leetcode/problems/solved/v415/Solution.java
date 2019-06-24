package leetcode.problems.solved.v415;

import java.util.Scanner;

public class Solution {
    public static String addStrings(String num1, String num2) {
        String[] num1Arr = num1.split("");
        String[] num2Arr = num2.split("");
        String[] num3Arr;

        if ((num1Arr.length < num2Arr.length)) {
            num3Arr = addStringArrs(num1Arr, num2Arr);
        } else {
            num3Arr = addStringArrs(num2Arr, num1Arr);
        }

        StringBuilder sb = new StringBuilder();
        for (String s : num3Arr) {
            if (s!=null) {
                sb.append(s);
            }
        }
        return sb.toString();
    }

    public static String[] addStringArrs(String[] arr1, String[] arr2) {
        String[] arr3 = new String[arr2.length + 1];
        int add = 0;
        for (int i = 1; i <= arr2.length; i++) {
            int a, b, c;
            if (i > arr1.length) {
                a = 0;
            } else {
                a = Integer.parseInt(arr1[arr1.length - i]);
            }
            b = Integer.parseInt(arr2[arr2.length - i]);

            c = a + b + add;
            if (c < 10) {
                arr3[arr3.length - i] = String.valueOf(c);
                add = 0;
            } else {
                arr3[arr3.length - i] = String.valueOf(c % 10);
                add = 1;
            }
        }

        if (add == 1) arr3[0] = "1";

        return arr3;
    }

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(addStrings(a,b));
    }
}