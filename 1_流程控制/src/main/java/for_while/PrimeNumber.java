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
//方法一
public class PrimeNumber {
    public static void main(String[] args) {
        boolean isFlag;
        int count = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();

        long start1 = System.currentTimeMillis();
        for (int i = 2; i <= 100000; i++) {
            if (i % 2 != 0 || i == 2) {
                isFlag = true;
                double m = Math.sqrt(i);//优化2：将被除数开方（减少内层循环次数）
                for (int j = 2; j <= m; j++) {
                    if (i % j == 0) {
                        isFlag = false;
                        break;     //优化1：有因数跳出寻新欢（对本身非质数的自然数有效）
                    }
                }
                if (isFlag == true) {
                    count++;
                    list.add(i);
                    //System.out.print(i + "\t"); //打印会拖慢cpu运行速度
                }
            }

        }
        long end1 = System.currentTimeMillis();
        System.out.println(" ");
        System.out.println(list);
        System.out.println("质数的个数：" + count);
        System.out.println("花费的时间为：" + (end1 - start1));

        //优化2：对本身是质数的有效
        count = 0;
        list.clear();
        long start3 = System.currentTimeMillis();
        for (int i = 2; i <= 100000; i++) {
            isFlag = true;
            double m = Math.sqrt(i);//优化2：将被除数开方（减少内层循环次数）
            for (int j = 2; j <= m; j++) {
                if (i % j == 0) {
                    isFlag = false;
                    break;     //优化1：有因数跳出寻新欢（对本身非质数的自然数有效）
                }
            }
            if (isFlag == true) {
                count++;
                list.add(i);
                //System.out.print(i + "\t"); //打印会拖慢cpu运行速度
            }
        }
        long end3 = System.currentTimeMillis();
        System.out.println(" ");
        System.out.println(list);
        System.out.println("质数的个数：" + count);
        System.out.println("花费的时间为：" + (end3 - start3));
    }
}
