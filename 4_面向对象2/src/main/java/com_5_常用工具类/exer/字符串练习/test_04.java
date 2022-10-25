package com_5_常用工具类.exer.字符串练习;

import java.util.Arrays;

/**
 * @author Liu
 * @create 2022-10-11-20:31
 * @description:
 */
public class test_04 {
    public static void main(String[] args) {
        String str = "hello aray java and python!";

       /* char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(i==0){
                chars[0]= (char) (chars[0]-32);
            }
            if(chars[i]==' '){
                chars[i+1] = (char) (chars[i + 1] - 32);
            }
        }
        System.out.println(chars);*/

        String[] s = str.split(" ");
        String newStr = "";
        for (int i = 0; i < s.length; i++) {
//            s[i]=s[i].replace(s[i].charAt(0), (char) (s[i].charAt(0)-32));
//            newStr=newStr+s[i]+" ";
            char c = s[i].toUpperCase().charAt(0);
            String s1 = s[i].substring(1);
            s[i] = c + s1;
            newStr += s[i] + " ";
        }
        System.out.println(Arrays.toString(s));
        System.out.println(newStr);



       /*char[] chars = str.toCharArray();
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
        System.out.println(newStr);*/
    }
}
