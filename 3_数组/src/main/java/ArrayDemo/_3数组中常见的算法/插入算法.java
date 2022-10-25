package ArrayDemo._3数组中常见的算法;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Liu
 * @create 2022-09-28-10:16
 * @description:
 */
public class 插入算法 {
    public static void main(String[] args) {
        int[] scores = new int[]{53, 59, 64, 75, 78, 81, 95, -1};
        System.out.println("请输入新成绩");
        Scanner in=new Scanner(System.in);
        int newScore = in.nextInt();

        //判断newScore在数组中的位置
        int index = scores.length - 1;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > newScore) {
                index = i;
                break;
            }
        }
        //数组元素后移
        for (int i=scores.length-1; i >index; i--) {
            scores[i]=scores[i-1];
        }
        //插入数据
        scores[index]=newScore;
        System.out.println(Arrays.toString(scores));

    }
}