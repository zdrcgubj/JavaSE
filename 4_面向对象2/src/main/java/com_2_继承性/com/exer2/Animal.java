package com_2_继承性.com.exer2;

/**
 * @author Liu
 * @create 2022-10-08-11:18
 * @description:
 */
public class Animal {
    private String type;

    public void sound() {
        System.out.println("动物叫");
    }
}

class TestAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        Cat cat = new Cat();
        cat.sound();
    }
}
