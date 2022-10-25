package ArrayDemo._1一维数组.dailyWork2;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Liu
 * @create 2022-09-28-20:49
 * @description:
 */
public class t_01不重复的随机数 {
    public static void jusge(int temp) {

    }

    public static void main(String[] args) {
        int[] num = new int[10];

        Random random = new Random();

        //int s= random.nextInt(20-1)+1;//1-20
        num[0] = random.nextInt(12 - 1) + 1;

        for (int i = 1; i < num.length; i++) {
            int temp = random.nextInt(12 - 1) + 1;
            for (int j = 0; j < i; j++) {
                if (num[j] == temp) {
                     temp = random.nextInt(12 - 1) + 1;
                    j=-1;
                }
            }
            num[i] = temp;

        }
        System.out.println(Arrays.toString(num));
    }
}
