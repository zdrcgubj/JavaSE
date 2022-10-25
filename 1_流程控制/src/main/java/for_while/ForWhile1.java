package for_while;

import java.util.Scanner;

/**
 * @author Liu
 * @create 2022-06-11-18:11
 * 输入两个正整数，求其最大公约数和最小公倍数
 * test：12  20
 * out：4   60
 */
public class ForWhile1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("m:");
        int m = in.nextInt();
        System.out.println("n:");
        int n = in.nextInt();
        int product = m * n;
        //辗转相除8
        int temp = m > n ? m % n : n % m;

        while (temp != 0) {
            if (m > n) {
                m = temp;
                temp = m > n ? m % n : n % m;
            } else {
                n = temp;
                temp = m > n ? m % n : n % m;
            }
            System.out.println("m:" + m + " n:" + n);
        }
        m = m > n ? n : m;
        System.out.println("最大公约数:" + m);
        System.out.println("最小公倍数：" + product / m);


//        while (m % n != 0) {
//            if (m < n) {
//                int temp = m;
//                m = n;
//                n = temp;
//            }
//            m = m % n;
//            System.out.println("m:" + m + " n:" + n);
//        }
//        System.out.println("最大公约数:" + n);
//        System.out.println("最小公倍数：" + product / n);

        //减损
/*
        int temp = (m > n) ? (m - n) : (n - m);
        while (0 != temp) {
            if (temp > n) {
                m  = temp;
                temp = (m > n) ? (m - n) : (n - m);
            } else {
                m = n;
                n = temp;
                temp = (m > n) ? (m - n) : (n - m);
            }
            System.out.println("m:" + m + " n:" + n);
        }
        System.out.println("最大公约数:" + m);
        System.out.println("最小公倍数："+product/m);
*/


    }
}

//for循环
class ForTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("m:");
        int m = in.nextInt();
        System.out.println("n:");
        int n = in.nextInt();
        int product = m * n;
        int min = m > n ? n : m;
        for (int i = min; i > 0; i--) {
            if (0 == m % i && 0 == n % i) {
                System.out.println(i);
                System.out.println(product / i);
                break;
            }
        }
    }
}
