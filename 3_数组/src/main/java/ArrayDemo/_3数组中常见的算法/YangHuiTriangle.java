package ArrayDemo._3数组中常见的算法;

import java.util.Arrays;

/**
 * @author Liu
 * @create 2022-06-24-10:59
 * 使用二维数组打印一个 10 行杨辉三角。
 * 【提示】
 * 1. 第一行有 1 个元素, 第 n 行有 n 个元素
 * 2. 每一行的第一个元素和最后一个元素都是 1
 * 3. 从第三行开始, 对于非第一个元素和最后一个元
 * 素的元素。即：
 * yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j]
 */
//杨辉三角
public class YangHuiTriangle {
    public static void main(String[] args) {
        //声明并初始化二维数组
        int[][] arr = new int[10][];

        //给数组元素赋值
        for (int i = 0; i < arr.length; i++) {
            //第n行有n列
            arr[i] = new int[i + 1];

            //首末元素赋值
            arr[i][0] = 1;
            arr[i][i] = 1;

            //剩余元素赋值
            for (int j = 1; j < i; j++) {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
        //遍历
/*        for (int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }*/

        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length; j >i ; j--) {
                System.out.print("\t");
            }
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t\t");
            }
            System.out.println();
        }

    }
}
class extra {
    public static void main(String[] args) {
        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (30 - 1) + 1);

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }

            }
        }
        for (int a : arr) {
            System.out.println(a);

        }
    }
}
