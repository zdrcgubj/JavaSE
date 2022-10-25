package com.daysWork;

/**
 * @author Liu
 * @create 2022-09-26-20:11
 * @description:
 */
public class 哥德巴赫猜想 {
    public static void main(String[] args) {
        getValue(20);
    }

    public static void getValue(int m) {

        if (m < 6 || m % 2 != 0) {
            return;
        }

        for (int i = 2; i <= m / 2; i++) {
            //i,m-i为质数则向下执行
            if (isPrime(i) && isPrime(m - i)) {
                System.out.println(m + "=" + i + "+" + (m - i));
            }

        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
