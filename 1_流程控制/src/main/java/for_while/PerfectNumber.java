package for_while;

/**
 * @author Liu
 * @create 2022-06-21-18:47
 */
public class PerfectNumber {
    public static void main(String[] args) {
        int sum;
        long start = System.currentTimeMillis();
        for (int i = 2; i < 10000; i++) {
            sum = 0;
            double m = Math.sqrt(i);         //优化2：用j<=Math.sqrt(i)替换；
            for (int j = 1; j <= m; j++) { //优化1：用j<=i/2替换；
                if (0 == i % j) {      //优化2：用平方根替换后可以求出i的两个因数
                    sum += j;
                    sum += i / j;       //第二个因数，此时会多加一个i，即sum最终大小为2*i
                }
            }
            if (sum == 2 * i) { //用平方根替换后,sum等于两倍i
                System.out.println(i);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时" + (end - start));
/*        int sum=0;
        int l=8128;
        double m=Math.sqrt(l);
        for(int j=1;j<=m;j++){
            if(l%j==0){
                sum+=j;
                sum+=l/j;
                System.out.println(j);
                System.out.println(l/j);
            }
        }
        if(sum==2*l){
            System.out.println("=============");
            System.out.println(l);
        }*/

    }
}
