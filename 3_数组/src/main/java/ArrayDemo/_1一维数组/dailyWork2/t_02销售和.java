package ArrayDemo._1一维数组.dailyWork2;

import java.util.Arrays;

/**
 * @author Liu
 * @create 2022-09-29-8:51
 * @description:
 */
public class t_02销售和 {
    public static void main(String[] args) {
        int sum=0;
        int[] sale1={22,66,44};//22+66+44=132
        int[] sale2={77,33,88};//77+33+88=198
        int[] sale3={25,45,65};//25+45+65=135
        int[] sale4={11,66,99};//11+66+99=176

        for(int i=0;i<sale1.length;i++){
            sum+=sale1[i];
            sum+=sale2[i];
            sum+=sale3[i];
            sum+=sale4[i];
        }
        System.out.println(sum);//132+198+135+176=641
    }
}
