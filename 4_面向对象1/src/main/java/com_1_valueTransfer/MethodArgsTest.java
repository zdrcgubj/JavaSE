package com_1_valueTransfer;

/**
 * @author Liu
 * @create 2022-07-04-19:48
 * 可变个数形参的方法
 * 1.jdk 5.0新增内容
 * 2.具体使用
 * 2.1可变形参的格式：数据类型 ... 变量名
 * 2.2当调用可变个数形参的方法时,传入参数可以是:0个,1个,2个, ...
 * 2.3可变个数形参的方法与本类方法名相同,形参不同的方法间构成重载
 * 2.4可变个数形参的方法和本类方法名相同,形参也相同的数组之间不构成重载(可变个数形参是指上是一维数组).即二者不能共存
 * 2.5可变个数形参在方法的形参中,只能声明在末尾
 * 2.6可变个数形参在方法的形参中,只能声明一个可变个数形参变量
 */
public class MethodArgsTest {
    public static void main(String[] args) {
        MethodArgsTest methodArgsTest = new MethodArgsTest();
        methodArgsTest.show("aaa", "asd", "ada");

    }

    public void show(String... strs) {
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }

    public void show(int[] i) {
        System.out.println(i);
    }

    public void show(int i, String... strs) {
    }
}

