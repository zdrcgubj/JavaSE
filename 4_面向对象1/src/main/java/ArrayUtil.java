import com.sun.prism.impl.shape.BasicRoundRectRep;

import java.util.Arrays;

/**
 * @author Liu
 * @create 2022-07-03-17:51
 */
public class ArrayUtil {

    //数组的最大值
    public int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //数组的最小值
    public int getMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    //数组的的总和
    public int arraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //数组的平均值
    public int arrayAvg(int[] arr) {
        return arraySum(arr) / arr.length;
    }

    //反转数组
    public void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int temp;
        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    //复制数组
    public int[] copy(int[] arr) {
        int copyarr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyarr[i] = arr[i];
        }
        return copyarr;
    }

    //数组排序
    public void sort(int[] arr) {
        //冒泡排序

        for (int i = 0; i < arr.length - 1; i++) {
            int temp;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //遍历数组
    public void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1] + "]\n");
    }

    //查找指定元素
    public int getIndex(int[] arr, int dest) {
        for (int i = 0; i < arr.length; i++) {
            if (dest == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
