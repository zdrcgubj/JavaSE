package com_1_exer;

/**
 * @author Liu
 * @create 2022-09-29-14:21
 * @description:
 */
public class test01 {
    public static void main(String[] args) {
        clA clA = new clA();
       // clA.value=10;
        clA.method();
        clA.method(20);
    }
}

class clA {
    public  void method(){
       // System.out.println(value);
    }
    public  void method(int value){
        System.out.println(value);
    }
}
