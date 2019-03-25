package leetcode;

import java.util.*;

public class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        for (int i=0;i<words.length;i++){
            char[] arr = words[i].toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int j=0;j<arr.length;j++) {
                sb.append(alphabetToMorse(arr[j]));
            }
            set.add(sb.toString());
        }
        return set.size();
    }

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

class Main {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String s : emails) {
            String[] mail = s.split("@");
            String[] name = s.split("\\+");
            String realName = name[0].replace(".","");
            String realEmail = realName + "@" + mail[1];
            set.add(realEmail);
        }
        return set.size();
    }
}