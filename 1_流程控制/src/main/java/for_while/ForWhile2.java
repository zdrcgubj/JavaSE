package for_while;

import java.util.Scanner;

/**
 * @author Liu
 * @create 2022-06-13-19:31
 * 计数：+ -
 */
public class ForWhile2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int countP = 0;
        int countN = 0;
        System.out.println("请输入：");
        while (true) {
            int m = in.nextInt();
            if (m > 0) {
                countP++;
            } else if (m < 0) {
                countN++;
            }else{
                break;
            }
        }
        System.out.println("正数个数："+countP);
        System.out.println("负数个数："+countN);
    }


}
