package com_3_多态性.exer1;

/**
 * @author Liu
 * @create 2022-10-04-22:56
 * @description:
 */

class Base1 {
    public void add(int a, int... arr) {
        System.out.println("base1");
    }
}

class Sub1 extends Base1 {
    public void add(int a, int[] arr) {
        System.out.println("sub_1");
    }

    public void add(int a, int b, int c) {
        System.out.println("sub_2");
    }
}

public class 方法的重写 {
    public static void main(String[] args) {
        Base1 base1 = new Sub1();
        base1.add(1,2,3);//sub_1

        Sub1 s=(Sub1)base1;
        s.add(1,2,3);//sub_2
    }
}
