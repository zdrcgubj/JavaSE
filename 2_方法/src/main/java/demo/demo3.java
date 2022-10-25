package demo;

/**
 * @author Liu
 * @create 2022-09-26-17:15
 * @description:
 */
public class demo3 {
    public static void main(String[] args) {
        System.out.println(new demo3().calc(12345));

    }

    //输出各个位数
//    public void calc(int n) {
//        if (n != 0) {
//            System.out.println(n % 10);
//            calc(n / 10);
//        }
//    }

    public int calc(int n) {
        if (n <10) {
            return n;
        }
        return (n%10)+calc(n/10);
    }
}
