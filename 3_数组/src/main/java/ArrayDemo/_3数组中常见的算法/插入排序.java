package ArrayDemo._3数组中常见的算法;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Liu
 * @create 2022-09-28-17:59
 * @description:
 */
public class 插入排序 {
    public static void main(String[] args) {
        int arr[] = {43, 63, -23, 9, 54, 33, 67, 82, -14, -2, -5, 0};
        int temp, i, j;

        for (i = 1; i < arr.length; i++) {
            //要插入的元素
            temp = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }

        System.out.println(Arrays.toString(arr));


    }
}
