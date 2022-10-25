package com_2_继承性.方法的重写;

/**
 * @author Liu
 * @create 2022-10-03-23:30
 * @description:方法的重写
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("tom","计算机");
        student.eat();
        student.walk(100);

        student.study();
    }
}
