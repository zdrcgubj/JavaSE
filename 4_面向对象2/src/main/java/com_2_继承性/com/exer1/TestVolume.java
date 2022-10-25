package com_2_继承性.com.exer1;

/**
 * @author Liu
 * @create 2022-10-03-17:17
 * @description:
 */
public class TestVolume {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();

        //cylinder.setRadius(3);
        cylinder.setLength(10);
        double volume = cylinder.getVolume();
        System.out.println("圆柱的体积是"+volume);
    }
}
