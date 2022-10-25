package com_1_valueTransfer;

/**
 * @author Liu
 * @create 2022-07-06-10:44
 * 方法形参的传递机制
 * 1.
 * 形参：方法定义时，声明的小括号内的参数
 * 实参：方法调用时，实际传递给形参的数据
 * 2.值传递机制
 * 如果参数是基本数据类型，此时实参赋给形参的是，实参真实存储的数据值
 * 如果参数是引用数据类型，此时实参赋给形参的是，实参保存的地址值
 */
public class ValueTransferTest1 {
    public static void main(String[] args) {

        int m = 20;
        int n = 10;
        System.out.println("m=" + m + " n=" + n);
//        int temp=m;
//        m=n;
//        n=temp;+
        new ValueTransferTest1().swap(m,n);
        System.out.println("m=" + m + " n=" + n);

    }

    public void swap(int m, int n) {
        int temp = m;
        m = n;
        n = temp;
    }
}


//public class ValueTransferTest1 {
//    public static void main(String[] args) {
//        Date date = new Date();
//        date.m = 20;
//        date.n = 10;
//        System.out.println("m=" + date.m + "n=" + date.n);
////        int temp=m;
////        m=n;
////        n=temp;
//        ValueTransferTest1 v = new ValueTransferTest1();
//        v.swap(date);
//        System.out.println("m=" + date.m + "n=" + date.n);
//    }
//
//    public void swap(Date date) {
//        int temp = date.m;
//        date.m = date.n;
//        date.n = temp;
//    }
//}

class Date {
    int m;
    int n;
}
