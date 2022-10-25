package com_test_面向对象三大特征;

import java.util.Arrays;

/**
 * @author Liu
 * @create 2022-10-08-21:02
 * @description:
 */

class Animal {

    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class Dog extends Animal {

//2


    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }
}

class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }
}

public class Test12 {

    public static void main(String args[]) {

        Animal[] as = new Animal[]{

                new Dog("Pluto"),

                new Cat("Tom"),

                new Dog("Snoopy"),

                new Cat("Garfield")

        };

        Dog[] dogs = getAllDog(as);

        for (int i = 0; i < dogs.length; i++) {

            System.out.println(dogs[i].getName());
        }

    }

    public static Dog[] getAllDog(Animal[] as) {
        Dog[] dogs = new Dog[as.length];
        int count = 0, index = 0;

        for (int i = 0; i < as.length; i++) {
            if (as[i] instanceof Dog) {
                dogs[index] = (Dog) as[i];
                count++;
                index++;
            }
        }
        dogs = Arrays.copyOf(dogs, dogs.length - count);
        return dogs;
//4
    }

}
