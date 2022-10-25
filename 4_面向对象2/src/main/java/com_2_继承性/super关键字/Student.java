package com_2_继承性.super关键字;

/**
 * @author Liu
 * @create 2022-10-04-0:32
 * @description:
 */
public class Student extends Person {
    String major;

    public Student() {
    }

    public Student(String major) {
        this.major = major;
    }

    public Student(String name, int age, String major) {
        super(name, age);//调用父类同参数的构造器
        this.major = major;
    }

    @Override
    public void eat() {
        System.out.println("学生吃了很多code");
    }

    public void show() {
        System.out.println("name =" + getName() + ",age =" + getAge() + ",专业 =" +major);
    }

}
