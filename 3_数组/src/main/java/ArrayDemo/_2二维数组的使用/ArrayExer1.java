package ArrayDemo._2二维数组的使用;

/**
 * @author Liu
 * @create 2022-06-24-10:31
 * 获取arr数组中所有元素的和。
 * j = 0 j = 1 j = 2 j = 3
 * i = 0   3    5    8    -
 * i = 1   12   9    -    -
 * i = 2   7    0    6    4
 */
public class ArrayExer1 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] arr = new int[][]{{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};//建立数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
                sum += arr[i][j];
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
