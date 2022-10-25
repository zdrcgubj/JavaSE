package for_while;

/**
 * @author Liu
 * @create 2022-06-13-17:46
 * 输出1000以内所有水仙花数
 */
public class ForTest2 {
    public static void main(String[] args) {
        //2的倍数和
//        int m = 0;
//        int count = 0;
//        for (int i = 0; i <= 10; i++) {
//            if (i % 2 != 0) {
//                m += i;
//            }
//        }
//        System.out.println(m);
//        m = 0;
//        for (int i = 1; i <= 21; i++) {
//            if (i % 7 == 0) {
//                count++;
//                m += i;
//            }
//        }
//        System.out.println((count - 1) + "\n" + (m - 7));

        //输出所有水仙花数，abc=a^3+b^3+c^3;
        for (int i = 100; i < 1000; i++) {
            int n1 = i / 100;
            int n2 = i % 100 / 10;
            int n3 = i % 10;
            if ((n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3) == i) {
                System.out.println("i:" + i + "\n n1:" + n1 + "\n n2:" + n2 + "\n n3:" + n3);
                System.out.println("========================================");
            }
        }

    }
}
