package ArrayDemo._1一维数组.dailyWork1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Liu
 * @create 2022-09-28-8:45
 * @description:
 */
public class t_05回文数 {
    public static boolean test(int num) {
        int[] arr = new int[8];
        int count = 0;
        //1遍历数组,存储各个位置的数
        for (int i = 0; i < arr.length; i++) {
            if (num == 0) {
                break;
            }
            //将num对10取余的值存入数组
            arr[i] = num % 10;
            count++;
            num = num / 10;
        }
        //2将数组缩容至count
        arr = Arrays.copyOf(arr, count);
        //3判断回文数
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("请输入");
            int num = in.nextInt();
            //输入0退出
            if (num == 0) {
                System.exit(0);
            }
            if (test(num)) {
                System.out.println(num + "是回文数");
            } else {
                System.out.println(num + "不是回文数");
            }
        }


    }
}
