package com_5_常用工具类._2_包装类的使用;

import org.junit.Test;

/**
 * @author Liu
 * @create 2022-10-09-23:46
 * @description:
 */
public class InterviewTest {
    @Test
    public void test1() {
        Object o1 = true ? new Integer(1) : new Double(2.0);
        System.out.println(o1);//1.0   三元运算符编译时要求两边同一成一个类型
        //int先提升成double 然后赋值给o1
    }

    @Test
    public void test2() {
        Object o2;
        if (true)
            o2 = new Integer(1);
        else {
            o2 = new Double(2.0);
        }
        System.out.println(o2);//1
    }
}
