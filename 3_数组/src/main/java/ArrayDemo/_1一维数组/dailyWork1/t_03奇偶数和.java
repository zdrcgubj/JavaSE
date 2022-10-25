package ArrayDemo._1一维数组.dailyWork1;

/**
 * @author Liu
 * @create 2022-09-27-20:55
 * @description:
 */
public class t_03奇偶数和 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 13, 3, 6, 1, 4, 7, 3, 2};
        int sum = 0, sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            } else {
                sum2 += arr[i];
            }
        }
        System.out.println("偶数和："+sum+"\t奇数和"+sum2);
    }
}
