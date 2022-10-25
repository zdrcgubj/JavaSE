package ArrayDemo._1一维数组.dailyWork1;

import javax.sql.rowset.serial.SerialArray;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Liu
 * @create 2022-09-27-20:43
 * @description:
 */
public class t_01数组逆序 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] arr=new String[5];
        System.out.println("请输入");
        for (int i = 0; i <5 ; i++) {
            String sentence=in.next();
            arr[i]=sentence;
        }

        for (int i = arr.length-1; i >0; i--) {
            System.out.println(arr[i]);
        }
        System.out.println(arr);
    }


}
