package leetcode.problems.solved.v989;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        StringBuilder sb = new StringBuilder();

        for (int i=0;i<A.length;i++) {
            sb.append(A[i]);
        }
        BigInteger bi = new BigInteger(sb.toString());
        BigInteger bk = new BigInteger(String.valueOf(K));
        bi = bi.add(bk);

        List<Integer> list = new ArrayList<>();
        for (char c : bi.toString().toCharArray()) {
            list.add(Character.getNumericValue(c));
        }

        return list;
    }
}