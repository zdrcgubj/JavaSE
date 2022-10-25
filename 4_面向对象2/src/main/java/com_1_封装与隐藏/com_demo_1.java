package com_1_封装与隐藏;

/**
 * @author Liu
 * @create 2022-10-02-16:39
 * @description:
 */
public class com_demo_1 {
    public static void main(String[] args) {
        Animal animal = new Animal();

//        animal.name = "gg";
//        animal.age = 10;

        animal.setLegs(-2);
        animal.show();
    }
}

class Animal {
    private String name;
    private int age;
    private int legs;

    public void setLegs(int l) {
        if (l >= 0 && l % 2 == 0) {
            legs = l;
        } else {
            legs = 0;
        }
    }

    public void eat() {
        System.out.println(name + "进食");
    }

    public void show() {
        System.out.println("name =" + name + ",age =" + age + ",legs =" + legs);
    }
}
