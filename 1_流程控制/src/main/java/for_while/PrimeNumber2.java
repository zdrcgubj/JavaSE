package for_while;

import java.util.ArrayList;

/**
 * @author Liu
 * @create 2022-06-20-9:44
 * Q:求****以内所有质数
 * <p>
 * 未优化：13784
 * 优化1：1114 加break
 * 优化2：38   对j的循环条件开方
 * 优化4：11   去除打印操作(将数据存储在arraylist中最后再输出：13）
 */
//方法二
public class PrimeNumber2 {
    public static void main(String[] args) {

        int count = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();

        long start1 = System.currentTimeMillis();
        label:
        for (int i = 2; i <= 3000; i++) {
            if (i % 2 != 0 || i == 2) {
                double m = Math.sqrt(i);//优化2：将被除数开方（减少内层循环次数）
                for (int j = 2; j <= m; j++) {
                    if (i % j == 0) {
                        continue label;
                    }
                }
                //执行到此都是质数
                count++;
                list.add(i);
            }

        }
        long end1 = System.currentTimeMillis();
        System.out.println(" ");
        System.out.println(list);
        System.out.println("质数的个数：" + count);
        System.out.println("花费的时间为：" + (end1 - start1));
    }
}
