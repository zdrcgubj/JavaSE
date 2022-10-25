package com_5_常用工具类.exer.字符串练习;

import java.util.Arrays;

/**
 * @author Liu
 * @create 2022-10-12-23:41
 * @description: 将上面的字符串拆分，结果如下:
 * zhangsan 180 90728
 */
public class test_07 {
    public static void main(String[] args) {
        String s = "name=zhangsan height=180 classNo=90728", newstr = "";
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            int index = str[i].indexOf("=");
            newstr += str[i].substring(index + 1) + " ";
        }

        System.out.println(Arrays.toString(str));
        System.out.println(newstr);
    }
}
