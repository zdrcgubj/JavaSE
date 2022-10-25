package com_5_常用工具类._1_Object类的使用.getClass方法;

/**
 * @author Liu
 * @create 2022-10-11-11:36
 * @description:
 */
public class getClass方法 {
    public static void main(String[] args) {
        //判断运行时d对象和c对象是否是同一个类型
        Animal d = new Dog();
        Animal c = new Cat();

        //方式1：通过 instanceof 关键字判断
        if ((d instanceof Dog && c instanceof Dog) || (d instanceof Cat && c instanceof Cat)) {
            System.out.println("是同一个类型");
        } else {
            System.out.println("不是同一个类型");
        }
        //方式2：通过getClass方法 判断
        if (d.getClass() == c.getClass()) {
            System.out.println("是同一个类型");
        } else {
            System.out.println("不是同一个类型");
        }
    }
}

class Animal {

}

class Dog extends Animal {

}

class Cat extends Animal {

}
