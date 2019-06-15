package leetcode.contest.biweekly.contest1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import static java.util.Comparator.comparing;

public class Solution {
    public static void main(String... args) {
        Solution sol = new Solution();

//        System.out.println(sol.indexPairs("ababa", new String[]{"aba","ab"}));
        System.out.println(sol.digitsCount(0,625,1250));
    }

//    public boolean isLongPressedName(String name, String typed) {
//    }

    public int digitsCount(int d, int low, int high) {
        int count = 0;
        for (int i=low;i<=high;i++) {
            if (i>=100000000 && i/100000000%10 == d) {
                if (i+10000000<=high) {
                    count+=111111111;
                    i+=99999999;
                    continue;
                }
                count++;
            }
            if (i>=10000000 && i/10000000%10 == d) {
                if (i+1000000<=high) {
                    count+=1111111;
                    i+=9999999;
                    continue;
                }
                count++;
            }
            if (i>=1000000 && i/1000000%10 == d) {
                if (i+1000000<=high) {
                    count+=1111111;
                    i+=999999;
                    continue;
                }
                count++;
            }
            if (i>=100000 && i/100000%10 == d) {
                if (i+100000<=high) {
                    count+=111111;
                    i+=99999;
                    continue;
                }
                count++;
            }
            if (i>=10000 && i/10000%10 == d) {
                if (i+10000<=high) {
                    count+=11111;
                    i+=9999;
                    continue;
                }
                count++;
            }
            if (i>=1000 && i/1000%10 == d) {
                if (i+1000<=high) {
                    count+=1111;
                    i+=999;
                    continue;
                }
                count++;
            }
            if (i>=100 && i/100%10 == d) {
                if (i+100<=high) {
                    count+=111;
                    i+=99;
                    continue;
                }
                count++;
            }
            if (i>=10 && i/10%10 == d) {
                if (i+10<=high) {
                    count+=11;
                    i+=9;
                    continue;
                }
                count++;
            }
            if (i%10 == d) {
                count++;
                i+=9;
            }
        }
        return count;
    }

    public int[][] indexPairs(String text, String[] words) {
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(words, new java.util.Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();// comparision
            }
        });
        for(int i=0;i<text.length();i++) {
            for(String s : words) {
                if (i + s.length() > text.length()) continue;
                String sub = text.substring(i,i+s.length());
                if (sub.equals(s)) {
                    List<Integer> point = new ArrayList<>();
                    point.add(i);
                    point.add(i+s.length()-1);
                    list.add(point);
                }
            }
        }

        int[][] result = new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            List<Integer> p = list.get(i);
            result[i][0] = p.get(0);
            result[i][1] = p.get(1);
        }

        return result;
    }

    public int fixedPoint(int[] A) {
        for (int i=0;i<A.length;i++) {
            if (A[i] == i) return i;
        }
        return -1;
    }
}