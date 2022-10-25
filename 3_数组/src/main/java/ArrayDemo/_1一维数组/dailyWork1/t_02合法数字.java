package ArrayDemo._1一维数组.dailyWork1;

/**
 * @author Liu
 * @create 2022-09-27-20:50
 * @description:
 */
public class t_02合法数字 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,12,3,6,1,4,8,3,2};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1||arr[i]==2||arr[i]==3){
                count++;
            }
        }
        System.out.println("合法数字个数："+count+"\t非法数字个数："+(arr.length-count));

    }
}
