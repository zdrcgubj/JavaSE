

import java.util.Scanner;

/**
 * @author Liu
 * @create 2022-06-22-18:35
 * 数    n组的元素，既可以是基本数据类型，也可以是引用数据类型
 * 3）创建数组对象会在内存中开辟一整块连续的空间
 * 4）数组的长度一旦确定，就不能修改。
 * <p>
 * 4. 数组的分类：
 * ① 按照维数：一维数组、二维数组、。。。
 * ② 按照数组元素的类型：基本数据类型元素的数组、引用数据类型元素的数组
 * <p>
 * 5. 一维数组的使用
 * ① 一维数组的声明和初始化
 * ② 如何调用数组的指定位置的元素
 * ③ 如何获取数组的长度
 * ④ 如何遍历数组
 * ⑤ 数组元素的默认初始化
 * ⑥ 数组的内存解析
 */


public class index {
    public static void main(String[] args) {
//        int[] l = new int[5];
//        String[] ll = new String[3];
//        char ch[] = new char[5];
//        String aa = "akdad";
//        ll[0] = "a";
//        ll[1] = "ab";
//        ll[2] = "abc";
//        for (char o : ch) {
//            System.out.println(o);
//        }
//
//
//        System.out.println(ll);
//        System.out.println(aa.length());

        int[] arr=new int[]{1,2,3};
        System.out.println(arr);

        char[] chars=new char[]{'a','b','c'};
        System.out.println(chars);

        String[] a=new String[]{"k","l"};
        System.out.println(a);


    }
}
