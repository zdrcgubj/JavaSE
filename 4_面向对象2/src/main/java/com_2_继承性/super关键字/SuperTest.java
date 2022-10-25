package com_2_继承性.super关键字;

/**
 * @author Liu
 * @create 2022-10-04-0:32
 * @description:
 */
public class SuperTest {
    public static void main(String[] args) {

        Student student = new Student("tom",22,"C");
        student.show();

        System.out.println("===============");
        Student student1 = new Student();
    }

}
