package ArrayDemo._1一维数组.dailyWork2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Liu
 * @create 2022-09-29-9:04
 * @description:
 */
public class t_03插入test {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner scanner = new Scanner(System.in);
        //赋初值
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
        }
        System.out.println(Arrays.toString(arr));
        //插入数据
        while (true){
            //要插入的数据
            System.out.println("请输入要插入的数据");
            int insertNum=scanner.nextInt();
            if(insertNum==-1){
                break;
            }
            //数组扩容
            arr=Arrays.copyOf(arr,arr.length+1);
            //重新给index赋值
            int index=arr.length-1;

            System.out.println(Arrays.toString(arr));
            for (int i = 0; i <arr.length ; i++) {
                if (arr[i]>insertNum){
                    //要插入的位置
                    index=i;
                    //找到第一个退出
                    break;
                }
            }
            for (int j = arr.length-1; j >index ; j--) {
                //从后往前前覆盖后
                arr[j]=arr[j-1];
            }
            arr[index]=insertNum;
            System.out.println(Arrays.toString(arr));
        }
    }
}
