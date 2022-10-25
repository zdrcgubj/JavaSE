package com_1_exer;


/**
 * @author Liu
 * @create 2022-06-28-18:22
 */
public class CircleTest {
    static int add(int a,int b){
        return a;
    }
    public static void main(String[] args) {
//        CircleArea circleArea = new CircleArea();
//        circleArea.radius = 2;
//        circleArea.calArea();
        /*匿名对象的使用*/
//        new CircleArea().radius = 2;
//        new CircleArea().calArea();
//        new CircleArea().calPerimeter();//此时运行结果为0.0，匿名对象只能调用一次
//        System.out.println(new CircleArea().radius);//radius值也为零
        int add = add(1, 2);
        System.out.println(add);

        new circleCalc().calc(new CircleArea());//使用circleCalc对象实现circleArea的调用，传入的参数为circleArea的匿名对象
    }
}

class circleCalc {
    public void calc(CircleArea circleArea) {
        circleArea.radius = 3;
        circleArea.calArea();
        circleArea.calPerimeter();
    }
}

class CircleArea {
    double radius;

    public void calArea() {
        System.out.println(Math.PI * radius * radius);
    }

    public void calPerimeter() {
        System.out.println(Math.PI * radius * 2);
    }
}