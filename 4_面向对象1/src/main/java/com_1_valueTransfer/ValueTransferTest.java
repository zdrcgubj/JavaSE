package com_1_valueTransfer;

/**
 * @author Liu
 * @create 2022-07-04-22:26
 */
public class ValueTransferTest {
    public static void main(String[] args) {
        System.out.println("************基本数据类型************");
        int m = 10;
        int n = m;
        System.out.println("m=" + m + ",n=" + n);
        n = 20;
        System.out.println("m=" + m + ",n=" + n);
        System.out.println("************引用数据类型************");
        Order o1 = new Order();
        o1.orderId = 1001;
        Order o2 = o1;//赋值以后，o1和o2的地址相同，都指向了堆空间中的同一个对象实体。
        System.out.println("o1.orderId=" + o1.orderId + ",o2.orderId=" + o2.orderId);
        o2.orderId = 1002;
        System.out.println("o1.orderId=" + o1.orderId + ",o2.orderId=" + o2.orderId);
    }
}

class Order {
    int orderId;
}