package com_5_常用工具类.exer.字符串练习;

import java.util.Arrays;

/**
 * @author Liu
 * @create 2022-10-11-19:07
 * @description:
 */
public class test_01 {
    public static void main(String[] args) {
        String str = "this is a test of java";
        //1.统计该字符串中字母s出现的次数
        /*System.out.println("s出现的个数:"+countS(str)+"个");*/

        //2.取出子字符串"test"
        /*System.out.println(getTest(str));*/

        //3.用多种方式将本字符串赋值到一个字符数组char[] str中.
        /*getChar(str);*/

        //4.将字符串中每个单词的第一个字母变成大写， 输出到控制台。
        /*System.out.println(toUpperCase(str));*/

        //5.用两种方式实现该字符串的倒序输出。(用StringBuffer和for循环方式分别实现)
        reverseStr(str);

        //6.将本字符串转换成一个字符串数组，要求每个数组元素都是一个有意义的英文单词,并输出到控制台
        String[] s = str.split(" ");
        System.out.println(Arrays.toString(s));
    }

    public static void reverseStr(String str) {
        char[] chars = new char[str.length()];
        int index = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            chars[index++] = str.charAt(i);
        }
        System.out.println(chars);
    }

    public static String toUpperCase(String str) {
        char[] chars = str.toCharArray();
        System.out.println(chars);
        String newStr = "";
        for (int i = 0; i < chars.length; i++) {
            if (i == 0) {
                newStr = newStr + String.valueOf(chars[0]).toUpperCase();
                continue;
            }
            if (chars[i] == ' ') {
                //如果遇到空格将该值加进来
                newStr = newStr + String.valueOf(chars[i]);
                //将下一个字母转为大写
                String s = String.valueOf(chars[i + 1]).toUpperCase();
                newStr = newStr + s;
                i++;
                continue;
            }
            newStr = newStr + String.valueOf(chars[i]);
        }
        return newStr;
    }

    public static void getChar(String str) {
        //method1
        char[] chars = str.toCharArray();
        System.out.println(chars);
        //method2
        char[] chars1 = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars1[i] = str.charAt(i);
        }
        System.out.println(chars1);
    }

    public static String getTest(String str) {
        String target = "test";
        int i = str.indexOf(target);
        //截取目标字符串
        return str.substring(i, i + target.length());
    }

    public static int countS(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 's') {
                count++;
            }
        }
        return count;
    }
}


