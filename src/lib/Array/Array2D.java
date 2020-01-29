package lib.Array;

import java.util.Arrays;

public class Array2D {
    public static void main(String... args) {
        int[][] arr1 = {{3, 3}, {2, 1}, {1, 3}, {3, 2}};
        Array2D.sort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(Arrays.toString(arr1[i]));
        }

        String[][] arr2 = {{"c", "b"}, {"b", "a"}, {"a", "c"}, {"c", "a"}};
        Array2D.sort(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }
    }

    /**
     * 項目1,項目2で昇順にソートする。
     *
     * @param arr 2次元配列
     */
    public static void sort(int[][] arr) {
        Arrays.sort(arr, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return a[0] - b[0];
        });
    }

    /**
     * 項目1,項目2で昇順にソートする。
     *
     * @param arr 2次元配列
     */
    public static void sort(String[][] arr) {
        Arrays.sort(arr, (a, b) -> {
            if (a[0].equals(b[0])) return a[1].compareTo(b[1]);
            return a[0].compareTo(b[0]);
        });
    }
}
