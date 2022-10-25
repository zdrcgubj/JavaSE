package com_2_继承性.com.exer1;

/**
 * @author Liu
 * @create 2022-10-03-17:05
 * @description:
 */
public class Circle {
    private double radius;

    public Circle() {
        radius=1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    //计算面积
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
