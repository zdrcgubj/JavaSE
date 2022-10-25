package com_2_继承性.方法的重写;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @author Liu
 * @create 2022-10-03-23:11
 * @description:
 */
public class Person {
    String name;
    int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public  void eat(){
        System.out.println("吃饭");
    }

    public  void walk(int distance){
        System.out.println(name+"走了"+distance+"km");
    }

}
