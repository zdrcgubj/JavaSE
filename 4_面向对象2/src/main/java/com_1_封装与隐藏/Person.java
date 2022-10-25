package com_1_封装与隐藏;

/**
 * @author Liu
 * @create 2022-10-02-23:33
 * @description:
 */
public class Person {
    private String name;
    private int age;

    public Person() {
        String info = "Person初始化时，需要考虑如下1，2，3...(共40行代码）";
        System.out.println(info);

    }

    public Person(String name) {
        this();
        this.name = name;
    }

    public Person(int age) {
        this();
        this.age = age;
    }

    public Person(String name, int age) {
        this(age);
        this.name = name;
        this.eat();
        this.age = age;
    }

    public void eat() {
        System.out.println(name+"在吃balabala...");
    }

    public static void main(String[] args) {
        Person person = new Person("Tom",12);
        System.out.println(person.age);
    }
}
