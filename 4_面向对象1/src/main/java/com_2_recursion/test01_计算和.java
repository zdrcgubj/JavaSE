package com_2_recursion;

/**
 * @author Liu
 * @create 2022-10-02-15:33
 * @description:
 */
public class test01_计算和 {
    //计算1-100所有自然数的和
    public int sum(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + sum(num - 1);
        }
    }

    //已知一个数列：f(0)=1;f(1)=4,f(n+2)=2*f(n+1)+f(n),
    //其中n是大于0的整数，求f(10)的值
    public int method1(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return 2 * method1(n - 1) + method1(n - 2);
        }
    }
    //计算斐波那契数列的第n个值
    //f0=1,f1=1,f2=2,f3=3,f4=5
    public int method2(int n){
        if(n==0){
            return 1;
        }else if(n==1){
            return 1;
        }else {
            return method2(n-1)+method2(n-2);
        }
    }
    public static void main(String[] args) {
//        int sum = new test01_计算和().sum(100);
//        System.out.println(sum);

//        int f10 = new test01_计算和().method1(10);
//        System.out.println(f10);

        int ff=new test01_计算和().method2(10);
        System.out.println(ff);

    }
}











