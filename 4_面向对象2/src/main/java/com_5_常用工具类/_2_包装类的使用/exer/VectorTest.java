package com_5_常用工具类._2_包装类的使用.exer;

import java.util.Scanner;
import java.util.Vector;

/**
 * @author Liu
 * @create 2022-10-10-12:00
 * @description:
 */
/*
* 利用
Vector 代替数组处理：从键盘读入学生成绩（以负数代表输入结束），找出
最高分，并输出学生成绩等级。
提示：数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的
长度。而向量类 java.util.Vector 可以根据需要动态伸缩。
创建 Vector 对象： Vector v=new Vector();
给向量添加元素 v.addElement(Object obj ); obj 必须是对象
取出向量中的元素： Object obj v.elementAt (
注意第一个元素的下标是 0 ，返回值是 Object 类型的。
计算向量的长度： v.size
若与最高分相差 10 分内： A 等； 20 分内： B 等；
30分内： C 等；其它： D 等
* */
public class VectorTest {
    public static void main(String[] args) {
        Vector vector = new Vector();
        Scanner in = new Scanner(System.in);

        Double scores, max = Double.MIN_VALUE;

        while (true) {
            System.out.println("请输入学生成绩:");
            scores = in.nextDouble();
            if (scores < 0) {
                break;
            }
            //写入数据
            vector.addElement(scores);
            max = max > scores ? max : scores;
        }
        //获取集合
        getScores(vector);
        System.out.println("最高成绩:" + max);
        //重新写入分数
        setScores(vector, max);
        //输出集合
        getScores(vector);
    }

    //定义集合输出分数的方法
    public static void getScores(Vector vector) {
        //循环输出vector原集合内容
        System.out.print("[");
        for (int i = 0; i < vector.size(); i++) {
            Object o = vector.elementAt(i);
            System.out.print(o);
            if (i != vector.size() - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
        System.out.println();
    }

    //将分数等级存入集合
    public static void setScores(Vector vector, Double max) {
        //循环输出vector成绩等级
        for (int i = 0; i < vector.size(); i++) {
            //集合中的分数
            Double o = (Double) vector.elementAt(i);
            vector.set(i, getLevel(o, max));
        }
    }

    //评判分数级别
    public static char getLevel(Double score, Double max) {
        int judgeLevel = (int) (max > score ? max - score : score - max);
        switch (judgeLevel / 10) {
            case 0:
                return 'A';
            case 1:
                return 'B';
            case 2:
                return 'C';
            default:
                return 'D';
        }
    }
}

