package com_5_常用工具类._3_String类;

/**
 * @author Liu
 * @create 2022-10-11-16:28
 * @description:
 */
public class StringTest {
    public static void main(String[] args) {
        //获取指定下标对应的字符，返回char类型
        /*String str1="abvjs123";
        System.out.println(str1.charAt(4));//s*/
        //获取指定字符串在原字符串中的下标,如果不包含该字符串则返回-1
/*        String str2="Hello world";
        System.out.println(str2.indexOf("word"));//-1
        System.out.println(str2.indexOf("world"));//6*/
        //返回指定子字符串在此字符串中最右边出现处的索引。
/*        String str3="Hello world";
        System.out.println(str3.lastIndexOf("o"));//7*/
        //判断两个字符串是否相等,忽略大小写
        /*     System.out.println("abc".equalsIgnoreCase("ABC"));//true*/
        //判断字符串是否为空串  ""
/*        String str4="Hello world";
        System.out.println(str4.isEmpty());//false*/

/*        String str5="12345678";
        ////判断字符串是否以指定的字符串开头
        System.out.println(str5.startsWith("12"));
        //判断字符串是否以指定的字符串开头,指定开始位置
        System.out.println(str5.startsWith("34",2));
        //判断字符串是否以指定的字符串结尾
        System.out.println(str5.endsWith("78"));*/
        //判断字符串中是否包含自定的字符串
        String str6="absnsbkk";
        System.out.println(str6.contains("sb"));

    }
}

