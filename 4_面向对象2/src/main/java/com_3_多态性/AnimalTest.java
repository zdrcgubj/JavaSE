package com_3_多态性;

/**
 * @author Liu
 * @create 2022-10-04-13:58
 * @description:
 */
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest animalTest = new AnimalTest();
        animalTest.fun(new Dog());
        boolean test = animalTest instanceof AnimalTest ;
        System.out.println(test);
    }

    public void fun(Animal animal){
        animal.eat();
        animal.shout();
    }
}

class Animal{
    public void eat(){
        System.out.println("动物：吃");
    }

    public  void shout(){
        System.out.println("动物叫");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("🐕吃🥩");
    }

    @Override
    public void shout() {
        System.out.println("喵喵喵");
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("🐱吃🐟");
    }

    @Override
    public void shout() {
        System.out.println("汪汪汪");
    }
}
