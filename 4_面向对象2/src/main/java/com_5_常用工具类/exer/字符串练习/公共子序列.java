package com_5_常用工具类.exer.字符串练习;

/**
 * @author Liu
 * @create 2022-10-13-0:02
 * @description:
 */
public class 公共子序列 {
    public static void main(String[] args) {
        String str1 = "abcwerthellouyiodef";
        String str2 = "helalou";
        //记录有多个公共字串
        int isFlag = 0;
        //取出最短串
        String min = str1.length() > str2.length() ? str2 : str1;
        String max = str1.length() < str2.length() ? str2 : str1;
        System.out.println(min);
        //循环轮次,每过一轮有效短串长度(target)减一
        w:
        for (int i = 0; i < min.length(); i++) {
            //循环短串,保证每次target取完短串减少长度的所有字串
            for (int j = 0; j <= i; j++) {
                String target = str2.substring(j, min.length() - i + j);
                System.out.println(i + "==" + target);
                if (max.contains(target)) {
                    isFlag++;
                    System.out.println("最长公共字串是" + target);
                }
            }
            //此长度下isFlag不等于0跳出循环
            if (isFlag != 0) {
                break;
            }
        }
        //循环执行完毕isFlag==0则无公共字串
        if (isFlag == 0) {
            System.out.println("无公共字串!");
        }
    }
}
