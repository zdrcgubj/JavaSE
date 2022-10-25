package com_2_继承性;

/**
 * @author Liu
 * @create 2022-10-03-13:45
 * @description:
 */
public class Student extends Person {
    String major;

    public Student() {

    }

    public Student(String name, int age, String major) {
        super(name, age);
        this.name = name;
        //this.age = age;
        this.major = major;
    }
}

class test01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "tom";
        person.eat();
        System.out.println("============");

        Student student = new Student();
        student.name = "lll";
        student.eat();
        student.sleep();
        student.setAge(12);
        System.out.println(student.getAge());
    }
}
