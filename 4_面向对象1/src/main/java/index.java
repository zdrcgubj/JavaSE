import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Liu
 * @create 2022-07-02-16:31
 */
public class index {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arr[] = new int[]{12, 34, 56, 71, 1, 0, 9, 6, 33, 24};
        int max = arrayUtil.getMax(arr);
        int min = arrayUtil.getMin(arr);
        int sum = arrayUtil.arraySum(arr);
        int avg = arrayUtil.arrayAvg(arr);
        System.out.println("max:" + max);
        System.out.println("min:" + min);
        System.out.println("sum:" + sum);
        System.out.println("avg:" + avg);
        arrayUtil.reverse(arr);
        System.out.println("反转"+Arrays.toString(arr));
        int[] arr2 = arrayUtil.copy(arr);
        System.out.println("复制"+Arrays.toString(arr2));
        arrayUtil.print(arr);
        int index=arrayUtil.getIndex(arr,56);
        System.out.println(index);
    }
}
