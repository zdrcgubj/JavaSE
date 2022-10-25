package ArrayDemo._3数组中常见的算法;

/**
 * @author Liu
 * @create 2022-06-24-17:02
 * 定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，
 * 然后求出所有元素的最大值，最小值，和值，平均值，并输出出来。
 * 要求：所有随机数都是两位数。
 */
//求数值型数组中元素的最大值、最小值、平均数、总和等
public class ArrayTest1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int max, min, sum;
        max = sum = 0;
        min = 100;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (100 - 10) + 10);
            sum += arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int a : arr) {
            System.out.print(a+"\t");
        }
        System.out.println("\n最大值：" + max + "\n"
                + "最小值：" + min + "\n"
                + "和值：" + sum + "\n"
                + "平均值：" + sum / arr.length + "\n");
    }
}
