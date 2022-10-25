package com_5_常用工具类._5_Date;

import java.util.Calendar;

/**
 * @author Liu
 * @create 2022-10-12-14:52
 * @description:
 */
public class CalendarTest {
    public static void main(String[] args) {
//        //创建calender对象
//        Calendar c1=Calendar.getInstance();
//
//        //get方法 用于获取信息
//
//        System.out.println(""+c1.get((Calendar.YEAR))+(c1.get((Calendar.MONTH))+1)+c1.get((Calendar.DAY_OF_MONTH)));
////        System.out.println(c1.get((Calendar.MONTH))+1);
////        System.out.println(c1.get((Calendar.DAY_OF_MONTH)));
////        System.out.println(c1.get((Calendar.DAY_OF_YEAR)));
////        System.out.println(c1.get((Calendar.YEAR)));

        Calendar c = Calendar.getInstance();


        //设置当前月第一天为一号
        c.set(Calendar.DAY_OF_MONTH, 1);
        System.out.println("星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t星期天");
        int weekday = c.get(Calendar.DAY_OF_WEEK) - 1;

        //按星期几打印空格
        for (int i = 1; i < weekday; i++) {
            System.out.print("\t\t");
        }

        while (c.get(Calendar.MONTH) == 9) {
            //打印天数
            System.out.print(c.get(Calendar.DAY_OF_MONTH));
            System.out.print("\t\t");
            if(weekday==1){
                System.out.println();
            }

            c.add(Calendar.DAY_OF_MONTH, 1);

            //重新获取星期
            weekday = c.get(Calendar.DAY_OF_WEEK);
        }

    }

}
