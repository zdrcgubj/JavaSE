package com.daysWork;

/**
 * @author Liu
 * @create 2022-09-26-19:15
 * @description:
 */
public class demo1 {

    //计算从1到某个数以内所有奇数的和
    public static int calcJishu(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    //计算从1到某个数以内所有能被3或者17整除的数的和。
    public static int calc2(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 17 == 0) {
                sum += i;
                System.out.println(i);
            }
        }
        return sum;
    }

    //计算1到某个数以内能被7或者3整除但不能同时被这两者整除的数的个数。
    public static int calc3(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0 || i % 7 == 0)) {
                if (i % 3 == 0 && i % 7 == 0) {
                    continue;
                } else {
                    count++;
                }

            }
        }
        return count;
    }

    //4.计算1到某个数以内能被7整除但不是偶数的数的个数。
    public static int calc4(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0 && i % 7 == 0) {
                System.out.println(i + "===========");
                count++;
            }

        }
        return count;
    }

    //5.定义三个参数，分别是长，宽，高。定义二个方法，分别计算并输出立方体的体积和表面积
    public static void area(double a, double b, double h) {
        System.out.println(2 * a * b + 2 * a * h + 2 * b * h);
    }

    public static void Volume(double a, double b, double h) {
        System.out.println(a*b*h);
    }

    public static void main(String[] args) {
        //1.奇数和
        // System.out.println(calcJishu(7));
        //2.
        // System.out.println(calc2(17));
        //3.
        //System.out.println(calc3(21));
        //4.
        // System.out.println(calc4(100));
        //5.
        //6.参数1为图形的行数，参数2为图形的形状(如：正方形 、长方形 等)
    }


}
