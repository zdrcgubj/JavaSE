package com_2_继承性;

/**
 * @author Liu
 * @create 2022-10-03-13:40
 * @description:
 */
public class Person {
    String name;
    private int age;

    public Person() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eatting");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}
