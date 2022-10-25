package com_2_继承性.方法的重写;

/**
 * @author Liu
 * @create 2022-10-03-23:11
 * @description:
 */
public class Student extends Person {
    String major;

    public Student() {
    }

    public Student(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public void study() {
        System.out.println(name + "专业是" + major);
    }

    public void eat() {
        System.out.println("学生吃了很多代码");
    }
}
