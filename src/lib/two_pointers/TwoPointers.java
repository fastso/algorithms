package lib.two_pointers;

import java.util.Arrays;

public class TwoPointers {
    public static void main (String... args) {
        TwoPointers tp = new TwoPointers();
        int[] a = new int[]{1,0,0};
        tp.moveZeroes(a);
        System.out.println(Arrays.toString(a));
    }

    /**
     * int配列にある0を後ろへ移動する。
     * （0でない数値の順番を変えない）
     * Input: [0,1,0,3,12]
     * Output: [1,3,12,0,0]
     *
     * @param nums int[]
     */
    public static void moveZeroes(int[] nums) {
        int next = 0;
        boolean only0;
        for (int i=0;i<nums.length-1;i++) {
            if (nums[i] == 0) {
                next = i;
                break;
            }
        }

        for (int i=0;i<nums.length-1;i++) {
            if (nums[i] == 0) {
                only0 = true;
                for (int j=next;j<nums.length;j++) {
                    if (nums[j] != 0) {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        only0 = false;
                        next = j;
                        break;
                    }
                }
                if (only0) break;
            }
        }
    }
}
