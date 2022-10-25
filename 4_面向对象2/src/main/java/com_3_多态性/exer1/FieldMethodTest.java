package com_3_多态性.exer1;

/**
 * @author Liu
 * @create 2022-10-04-22:33
 * @description:
 */

class Base {
    int count = 10;

    public void display() {
        System.out.println(this.count);

    }
}

class Sub extends Base {
    int count = 20;

    public void display() {
        System.out.println(this.count);
    }
}

public class FieldMethodTest {
    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println(s.count);//20
        s.display();//20
        Base b = s;
        System.out.println(b == s);//true 地址传递
        System.out.println(b.count);//10  多态不适应于属性
        b.display();//20  对象的多态性

    }
}
