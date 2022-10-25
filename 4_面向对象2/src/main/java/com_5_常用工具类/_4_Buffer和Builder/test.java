package com_5_常用工具类._4_Buffer和Builder;

/**
 * @author Liu
 * @create 2022-10-12-10:26
 * @description:
 */
public class test {
    public static void main(String[] args) {
        long start1 = System.currentTimeMillis();
        String s="a";
        for (int i = 0; i <100000 ; i++) {
            s+="a";
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1-start1);

        long start = System.currentTimeMillis();
        StringBuffer s1=new StringBuffer("a");
        for (int i = 0; i <10000000 ; i++) {
            s1.append("a");
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

        long start2 = System.currentTimeMillis();
        StringBuilder s2=new StringBuilder("a");
        for (int i = 0; i <10000000 ; i++) {
            s2.append("a");
        }
        long end2 = System.currentTimeMillis();
        System.out.println(end2-start2);
    }
}
