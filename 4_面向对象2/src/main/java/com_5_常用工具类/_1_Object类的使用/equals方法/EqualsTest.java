package com_5_常用工具类._1_Object类的使用.equals方法;

import java.util.Date;

/**
 * @author Liu
 * @create 2022-10-04-23:55
 * @description:
 */
public class EqualsTest {
    public static void main(String[] args) {

        //基本数据类型
        int i = 10;
        int j = 10;
        double d = 10.0;
        System.out.println(i == j);//true
        System.out.println(i == d);//true

        boolean b = true;
//		System.out.println(i == b);

        char c = 10;
        System.out.println(i == c);//true

        char c1 = 'A';
        char c2 = 65;
        System.out.println(c1 == c2);//true

        //引用类型：
        Customer cust1 = new Customer("Tom",21);
        Customer cust2 = new Customer("Tom",21);
        System.out.println(cust1 == cust2);//false  两个不同对象

        String str1 = new String("atguigu");
        String str2 = new String("atguigu");
        System.out.println(str1 == str2);//false
        System.out.println("****************************");
        System.out.println(cust1.equals(cust2));//false->true
        System.out.println(str1.equals(str2));//true

        Date date1 = new Date(32432525324L);
        Date date2 = new Date(32432525324L);
        System.out.println(date1.equals(date2));//true
    }
}
