package com_2_继承性.com.exer1;

/**
 * @author Liu
 * @create 2022-10-03-17:05
 * @description:
 */
public class Cylinder extends Circle {
    private double length;

    public Cylinder() {
        length=1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //计算体积
    public double getVolume() {
        return getArea() * length;
    }
}
