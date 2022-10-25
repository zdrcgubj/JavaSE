package ArrayDemo._1一维数组;

import java.util.Arrays;

/**
 * @author Liu
 * @create 2022-09-27-15:36
 * @description:
 */
public class 数组的拷贝 {
    public static void main(String[] args) {
        int[] arr1 = {1, 21, 31, 46, 74, 56};
//        copyArray1(arr1);
        copyArray2(arr1);

    }

    //System.arraycopy()方法
    public static void copyArray1(int[] arr) {
        //目标数组
        int[] arr2 = new int[arr.length + 5];

        /*
         * src:原数组
         * srcPos：原数组的起始位置
         * dest:目标数组
         * destPos：目标数组起始位置
         *length：拷贝长度
         * */
        System.arraycopy(arr, 1, arr2, 3, 4);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }
    }

    //2、Arrays类提供数组拷贝方法
    public static void copyArray2(int[] arr) {
        /*
         * original:数组
         * newLength:新数组的长度
         * 返回值：返回新数组
         * */
        arr = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
