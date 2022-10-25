package ArrayDemo._3数组中常见的算法;

import java.util.Arrays;

/**
 * @author Liu
 * @create 2022-09-28-11:19
 * @description:
 */
public class SelectSort {
    public static void main(String[] args) {
        int arr[] = {43, 34, -23, 9, 54, 33, 67, 82, -14, -2, -5, 0};


        int min, index, temp;
        for (int i = 0; i < arr.length - 1; i++) {
            min = arr[i];
            index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            //交换
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
