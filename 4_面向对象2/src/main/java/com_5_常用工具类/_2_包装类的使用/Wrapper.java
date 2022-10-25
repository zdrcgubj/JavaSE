package com_5_常用工具类._2_包装类的使用;

import org.junit.Test;

/**
 * @author Liu
 * @create 2022-10-09-20:46
 * @description:
 */
public class Wrapper {

    @Test
    public void test5() {
        String str1 = "123";
        String str2 = "123a";
        //1.调用 包装类的parseXx()方法
        int num = Integer.parseInt(str1);
        //int num2 = Integer.parseInt(str2);
        //System.out.println(num2);//NumberFormatException

        int num3=Integer.valueOf(str1);
        System.out.println(num3);

    }

    @Test
    public void test4() {
        //基本数据类型、包装类-->String类型
        int num = 10;
        //方式1:连接运算
        String str1 = num + "";
        //方式2:调用String的valueOf()
        float f1 = 12.3f;
        String str2 = String.valueOf(f1);
        //方式3:包装类的toString()
        double num2 = 10.3;
        String str3 = ((Double) num2).toString();
        System.out.println(str3);
    }

    @Test
    public void test3() {
        //自动装箱
        int num = 10;
        Integer integer = num;

        boolean b1 = true;
        Boolean b2 = b1;
        //自动拆箱
        System.out.println(integer.toString());

        int num2 = integer;
    }

    //包装类--->转基本数据类型:调用Xxx的xxxValue()
    @Test
    public void test2() {
        Integer in = new Integer(12);
        int i1 = in.intValue();
        System.out.println(i1);

        Float f1 = new Float("12.3f");
        float f2 = f1.floatValue();
        System.out.println(f2);
    }

    //基本数据类型--->包装类:调用包装类的构造器
    @Test
    public void test1() {
        int num = 10;
        Integer integer = new Integer(num);
        System.out.println(integer);
        /*-------------Float------------------*/
        Float f1 = new Float(12.3f);
        Float f2 = new Float("12.3");
        System.out.println(f1);
        System.out.println(f2);
        /*-------------Boolean------------------*/
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("TrUe");
        Boolean b3 = new Boolean("true123");
        System.out.println(b3);//false

        Order order = new Order();
        System.out.println(order.isMale);//false
        System.out.println(order.isFemale);//null
    }
}

class Order {
    boolean isMale;
    Boolean isFemale;
}
