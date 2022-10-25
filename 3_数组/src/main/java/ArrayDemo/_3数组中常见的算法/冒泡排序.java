package ArrayDemo._3数组中常见的算法;

import java.util.Arrays;

/**
 * @author Liu
 * @create 2022-09-28-11:31
 * @description:
 */
public class 冒泡排序 {
    public static void main(String[] args) {
        int arr[] = {43, 34, -23, 9, 54, 33, 67, 82, -14, -2, -5, 0};
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
