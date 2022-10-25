package com_2_继承性.super关键字;

/**
 * @author Liu
 * @create 2022-10-04-0:31
 * @description:
 */
public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("I'm Everywhere!");
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("吃饭");
    }

    public void walk() {
        System.out.println("走路");
    }

}
