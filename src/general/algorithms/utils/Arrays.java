package general.algorithms.utils;

import java.util.HashSet;
import java.util.Set;

public class Arrays {
    public static void main(String... args) {
        Arrays a = new Arrays();

        int[] nums = {1, 2, 3, 1};
        System.out.println(a.containsDuplicate(nums));
        new HashSet().contains("");

        // rotate test
//        int[] nums = {1, 2, 3, 4, 5, 6, 7};
//        a.rotate(nums, 3);
//        System.out.println(java.util.Arrays.toString(nums));
    }

    /**
     * 配列をk回ローテーションする。
     *
     * @param nums 配列
     * @param k    ローテーション回数
     */
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    /**
     * 配列の部分配列指定し、部分配列を反転する。
     *
     * @param nums  配列
     * @param start 開始位置
     * @param end   終了位置
     */
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    /**
     * 重複データ有無を判定する。
     *
     * @param nums 配列
     * @return 重複あり:true 重複なし:false
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }
}
