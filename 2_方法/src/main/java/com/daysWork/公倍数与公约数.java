package com.daysWork;

/**
 * @author Liu
 * @create 2022-09-26-20:03
 * @description:
 */
public class 公倍数与公约数 {
    public static void main(String[] args) {

    }

    public static void getValue(int m, int n) {
        int product = m * n;
        if (n > m) {
            int temp = m;
            m = n;
            n = temp;
        }
        for (int i = n; i > 0; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.println(i);
                System.out.println(product / i);
                break;
            }

        }

    }
}
