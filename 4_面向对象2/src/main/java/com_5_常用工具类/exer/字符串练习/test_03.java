package com_5_常用工具类.exer.字符串练习;

/**
 * @author Liu
 * @create 2022-10-11-20:20
 * @description:
 */
public class test_03 {
    public static void main(String[] args) {
        String str = "hello jaTTva ,";
        int countAA = 0, countaa = 0, countAll = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                countaa++;
            }
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                countAA++;
            }
            countAll++;
        }
        System.out.println(countaa);
        System.out.println(countAA);
        System.out.println(countAll-countAA-countaa);
    }
}
