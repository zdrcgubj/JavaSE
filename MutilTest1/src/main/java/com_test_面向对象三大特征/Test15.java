package com_test_面向对象三大特征;

/**
 * @author Liu
 * @create 2022-10-08-21:28
 * @description:
 */
class Shape {

    public double Area() {
        return 0;
    }

    public double Girth() {
        return 0;
    }

    public Shape() {
    }
}

class Circle extends Shape {
    int r;

    public  Circle() {
    }

     public  Circle(int r) {
        this.r = r;
    }

    @Override
    public double Area() {
        return Math.PI * r * r;
    }

    @Override
    public double Girth() {
        return Math.PI * r * 2;
    }

//    public double Area(double r) {
//        return Math.PI * r * r;
//    }

//    public double Girth(double r) {
//        return Math.PI * r * 2;
//    }
}

class Rect extends Shape {
    double l, w;

    public Rect() {
    }

    public Rect(double l, double w) {
        this.l = l;
        this.w = w;
    }

    @Override
    public double Area() {
        return l * w;
    }

    @Override
    public double Girth() {
        return 2 * (l + w);
    }

//    public double Area(double l, double w) {
//        return l * w;
//    }

//    public double Girth(double l, double w) {
//        return 2 * (l + w);
//    }

}

class Square extends Rect {
    double l;

    public Square() {
    }

    public Square(double l) {
        this.l = l;
    }

    @Override
    public double Area() {
        return l * l;
    }

    @Override
    public double Girth() {
        return 4 * l;
    }

//    public double Area(double l) {
//        return super.Area(l, l);
//    }
}

public class Test15 {
    public static void main(String[] args) {
//        Circle aa = new Circle();
//        System.out.println(aa.Area(2));
//
//        Rect rect = new Rect();
//        System.out.println(rect.Area(2, 3));
//
//        Square square = new Square();
//        System.out.println(square.Area(2));
        Shape[] shape = new Shape[]{
                new Circle(1),
                new Rect(1, 3),
                new Square(3),
        };
        System.out.println("⚪的面积:" + shape[0].Area() + " ⚪的周长:" + shape[0].Girth());
        System.out.println("▭的面积:" + shape[1].Area() + " ▭的周长:" + shape[1].Girth());
        System.out.println("□的面积:" + shape[2].Area() + " □的周长:" + shape[2].Girth());
    }
}
