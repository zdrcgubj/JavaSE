package ArrayDemo._3数组中常见的算法;

import java.util.Arrays;

/**
 * @author Liu
 * @create 2022-06-27-22:19
 * 数组的冒泡排序
 */
public class BubbleSortTest {
    public static void main(String[] args) {
        int arr[] = {43, 34, -23, 9, 54, 33, 67, 82, -14, -2, -5, 0};

        //冒泡排序
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);



    }
}
