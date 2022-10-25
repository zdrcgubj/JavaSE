package com_5_常用工具类._5_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Liu
 * @create 2022-10-12-14:29
 * @description:
 */
public class SimpleDateFormatTest {
    public static void main(String[] args) throws ParseException {
        //Date格式化为字符串
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
        Date date = new Date();
        String format = sdf.format(date);
        System.out.println(format);

        //字符串解析为Date
        String time = "2022-10-12 14:32:08 星期三";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
        Date date1 = sdf.parse(time);
        System.out.println(date1);
    }
}
