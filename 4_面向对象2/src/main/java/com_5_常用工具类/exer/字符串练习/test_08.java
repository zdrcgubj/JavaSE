package com_5_常用工具类.exer.字符串练习;

/**
 * @author Liu
 * @create 2022-10-12-23:52
 * @description:
 */
public class test_08 {
    public static void main(String[] args) {
        //模拟一个trim功能一致的方法。去除字符串两端的空白
        String str = "     qqq        hello world    ";
        //去掉前面的空白
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                str = str.substring(i);
                break;
            }
        }
        //去掉后面的空白
        for (int i = str.length() - 1; i > 0; i--) {
            if (str.charAt(i) != ' ') {
                str = str.substring(0, i + 1);
                break;
            }
        }
        System.out.println(str);
    }
}
