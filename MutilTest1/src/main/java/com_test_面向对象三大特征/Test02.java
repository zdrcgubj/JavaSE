package com_test_面向对象三大特征;

/**
 * @author Liu
 * @create 2022-10-08-20:48
 * @description:
 */
class Meal {

    public Meal() {

        System.out.println("Meal()");

    }

}

class Lunch extends Meal {

    public Lunch() {

        System.out.println("Lunch()");

    }

}

class Vegetable {

    public Vegetable() {

        System.out.println("Vegetable()");

    }

}

class Potato extends Vegetable {

    public Potato() {


        System.out.println("Potato()");

    }

}

class Tomato extends Vegetable {

    public Tomato() {

        System.out.println("Tomato()");

    }

}

class Meat {

    public Meat() {

        System.out.println("Meat()");

    }

}

class Sandwich extends Lunch {

    Potato p = new Potato();

    Meat m = new Meat();

    Tomato t = new Tomato();

    public Sandwich() {

        System.out.println("Sandwich()");

    }

}

public class Test02 {

    public static void main(String args[]) {

        Sandwich s = new Sandwich();


    }

}
