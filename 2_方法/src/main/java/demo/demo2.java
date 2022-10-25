package demo;

/**
 * @author Liu
 * @create 2022-09-26-15:41
 * @description
 */
public class demo2 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println(new demo2().count(1000000));
        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }

    public int count(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }

    public boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
