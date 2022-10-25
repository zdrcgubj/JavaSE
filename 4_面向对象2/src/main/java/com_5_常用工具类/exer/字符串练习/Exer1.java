package com_5_常用工具类.exer.字符串练习;

import java.util.Currency;

/**
 * @author Liu
 * @create 2022-10-12-9:58
 * @description:
 */
public class Exer1 {
    public static void main(String[] args) {
        String str = "11120222334456777889";
        for (int i = 0; i < 9; i++) {
            String replace = str.replace(String.valueOf(i), "");
            System.out.println(str);
            System.out.println(replace);
            System.out.println((i+"") +"出现了"+ (str.length() - replace.length()) + "次");
        }

    }
}
