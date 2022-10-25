package com_test_面向对象三大特征;

/**
 * @author Liu
 * @create 2022-10-09-9:28
 * @description:
 */
class Super {

    public Super() {

        System.out.println("Super()");

    }

    public Super(String str) {

        System.out.println("Super(String)");

    }

}

class Sub extends Super {


    public Sub() {

        System.out.println("Sub()");

    }

    public Sub(int i,String s) {

        this(s);

        System.out.println("Sub(int)");

    }

    public Sub(String str) {

        super(str);

        System.out.println("Sub(String)");

    }

}

public class Test01 {

    public static void main(String args[]) {

        Sub s1 = new Sub(); // Super() Sub()
        System.out.println("========");

        Sub s2 = new Sub(10,"2");//Super() Sub()  Sub(int)
        System.out.println("========");


        Sub s3 = new Sub("hello");//Super(String)  Sub(String)

    }

}
