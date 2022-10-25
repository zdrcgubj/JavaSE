import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Liu
 * @create 2022-10-16-19:47
 * @description:
 */
public class indexDemo {
    public static void main(String[] args) {
        int i = new indexDemo().climbStairs(35);
        System.out.println(i);
    }

    public int climbStairs(int n) {
        int count = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n / 2; j++) {
                if (1 * i + 2 * j == n) {
                    //有i个1,j个2
                    count += countc(i, j);
                    System.out.println(count);
                }
            }
        }

        return count;
    }

    public int countc(int count1, int count2) {
        int sumCount1 = 1;
        int sumCount = 1;
        if(count1==0||count2==0){
            return 1;
        }
        for (int i = count1+count2; i >count2 ; i--) {
            sumCount*=i;
        }
        for (int j=count1;j>0;j--){
            sumCount1*=j;
        }
        return sumCount/sumCount1;
    }
}
