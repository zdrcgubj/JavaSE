package com_5_常用工具类.exer.字符串练习;

/**
 * @author Liu
 * @create 2022-10-11-20:12
 * @description:
 */
public class test_02 {
    public static void main(String[] args) {
        String str = "java hejavallo javajava ,java is XXX ,java is xxxjava";
        countJava(str);
    }

    public static void countJava(String str) {
        int index = 0, count = 0;
        index = str.indexOf("java", index);
        while (true) {
            index = str.indexOf("java", index + 4);
            count++;
            if (index == -1) {
                break;
            }
        }
        System.out.println(count);
    }
}
