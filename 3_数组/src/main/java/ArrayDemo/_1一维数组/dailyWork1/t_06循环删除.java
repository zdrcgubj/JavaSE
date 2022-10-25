package ArrayDemo._1一维数组.dailyWork1;

import java.util.Arrays;

/**
 * @author Liu
 * @create 2022-09-28-11:59
 * @description:
 */
public class t_06循环删除 {


    public static int[] del(int[] arr) {
        //记录-1个数
        int sub = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                sub++;
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
            }
        }
        //数组长度-count 缩容
        arr = Arrays.copyOf(arr, arr.length - sub);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[80];
        int count = 0;
        //给数组赋初始值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        System.out.println(Arrays.toString(arr));

        //计算轮次
        int r=1;
        while (true) {
            if(arr.length==1){
                break;
            }
            //第一轮
            for (int i = 0; i < arr.length; i++) {
                count++;
                if (count % 3 == 0) {
                    arr[i] = -1;
                }
            }
            System.out.println("第"+r+"轮");
            System.out.println("count" + count);
            System.out.println(Arrays.toString(arr));
            arr = del(arr);
            r++;
            System.out.println(Arrays.toString(arr));
        }


    }
}
