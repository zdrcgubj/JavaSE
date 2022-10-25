package com_5_常用工具类.exer.字符串练习;

/**
 * @author Liu
 * @create 2022-10-12-8:46
 * @description:
 */
public class test_05 {
    public static void main(String[] args) {
        String id = "421102200112135654";
        //截取年
        String year = id.substring(6, 10);
        //截取月
        String month = id.substring(10, 12);
        //截取日
        String day = id.substring(12, 14);

        System.out.println("生日是:"+year+"年"+month+"月"+day+"日");
    }
}
