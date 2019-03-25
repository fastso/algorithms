package general.algorithms.utils;

import java.util.Scanner;

public class Convert {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(new Convert().romanToInt(s));
    }

    /**
     * ローマ数字文字列からintに変換する。
     * Symbol       Value
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     *
     * @param s ローマ数字文字列
     * @return int
     */
    public int romanToInt(String s) {
        int rst = 0;
        int equalValue = 0;

        char[] cArr = s.toCharArray();
        int[] iArr = new int[cArr.length];

        for (int i = 0; i < cArr.length; i++) {
            iArr[i] = romanToInt(cArr[i]);
        }

        for (int i = 1; i < iArr.length; i++) {
            if (iArr[i - 1] > iArr[i]) {
                rst += (equalValue + iArr[i - 1]);
                equalValue = 0;
            } else if (iArr[i - 1] == iArr[i]) {
                equalValue += iArr[i - 1];
            } else {
                rst -= (equalValue + iArr[i - 1]);
                equalValue = 0;
            }
        }
        rst += (equalValue + iArr[iArr.length - 1]);

        return rst;
    }

    /**
     * ローマ数字1文字からintに変換する。
     * Symbol       Value
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     *
     * @param c 文字
     * @return int
     */
    public int romanToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    /**
     * キャラクタ1文字をモールス符号に変換する。
     *
     * @param c キャラクタ
     * @return モース符号
     */
    public String alphabetToMorse(char c) {
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        switch (c) {
            case 'a':
                return morse[0];
            case 'b':
                return morse[1];
            case 'c':
                return morse[2];
            case 'd':
                return morse[3];
            case 'e':
                return morse[4];
            case 'f':
                return morse[5];
            case 'g':
                return morse[6];
            case 'h':
                return morse[7];
            case 'i':
                return morse[8];
            case 'j':
                return morse[9];
            case 'k':
                return morse[10];
            case 'l':
                return morse[11];
            case 'm':
                return morse[12];
            case 'n':
                return morse[13];
            case 'o':
                return morse[14];
            case 'p':
                return morse[15];
            case 'q':
                return morse[16];
            case 'r':
                return morse[17];
            case 's':
                return morse[18];
            case 't':
                return morse[19];
            case 'u':
                return morse[20];
            case 'v':
                return morse[21];
            case 'w':
                return morse[22];
            case 'x':
                return morse[23];
            case 'y':
                return morse[24];
            case 'z':
                return morse[25];
            default:
                return "Can not convert";
        }
    }
}
