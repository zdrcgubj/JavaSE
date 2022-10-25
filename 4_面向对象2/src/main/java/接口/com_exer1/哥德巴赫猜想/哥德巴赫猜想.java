package 接口.com_exer1.哥德巴赫猜想;

/**
 * @author Liu
 * @create 2022-10-10-16:28
 * @description:
 */
public class 哥德巴赫猜想 {
    public static void main(String[] args) {
        Test(24, new IsPrimeNum() {
            public boolean isPrime(int num) {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        });
    }

    public static void Test(int num, IsPrimeNum isPrimeNum) {
        if (num < 6 || num % 2 != 0) {
            System.out.println("not a legal number");
        }

        for (int i = 3; i <= num / 2; i++) {
            if (isPrimeNum.isPrime(i) && isPrimeNum.isPrime(num - i)) {
                System.out.println(num + "=" + i + "+" + (num - i));
            }
        }
    }
}
