package leetcode;

import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    public static void main(String... args) {

    }

    public int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];

        int i1 = 0;
        int i2 = A.length-1;
        for (int i = 0; i < A.length; i++) {
            if (A[i]%2 == 0) {
                result[i1] = A[i];
                i1++;
            } else {
                result[i2] = A[i];
                i2--;
            }
        }
        return result;
    }
}
