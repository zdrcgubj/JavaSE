package ArrayDemo._1一维数组;

import java.util.Arrays;

/**
 * @author Liu
 * @create 2022-09-27-18:59
 * @description:
 */
public class 数组的扩容 {
    //method1，自定义遍历扩容
    public static void enlargeArray(int[] arr) {
        //定义新数组  使其长度为原数组长度+1
        int[] arr2 = new int[arr.length + 1];

        //将原数组的元素拷贝到新数组中（遍历赋值）
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        //索引替换，将新数组的索引赋给原数组
        arr = arr2;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    //method2，使用Arrays.copyOf()方法扩容
    public static void enlargeArrayByCopyOf(int[] arr) {

        arr = Arrays.copyOf(arr, arr.length + 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 21, 31, 46, 74, 56};
        //method1
        // enlargeArray(arr);
        //method2
        enlargeArrayByCopyOf(arr);
    }
}
