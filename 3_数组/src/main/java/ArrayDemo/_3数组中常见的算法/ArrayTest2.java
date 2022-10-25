package ArrayDemo._3数组中常见的算法;

/**
 * @author Liu
 * @create 2022-06-26-11:44
 * 数组的复制、反转、查找(线性查找、二分法查找)
 */
//数组的复制、反转、查找(线性查找、二分法查找)
public class ArrayTest2 {
    public static void main(String[] args) {
        String[] arr = new String[]{"aa", "bb", "cc", "dd", "ee"};

        //数组的复制
/*        String[] arr1 = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }*/

        //数组的反转
/*        for (int left = 0, right = arr.length - 1; left < right; left++, right--) {
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        for (String ss : arr) {
            System.out.println(ss);
        }*/

        //线性查找
/*        String dest = "djd";
        boolean isFlag=true;
        for (int i = 0; i < arr.length; i++) {
            if (dest.equals(arr[i])) {
                System.out.println("找到了该元素，位置为：" + i);
                isFlag=false;
                break;
            }
        }
        if(isFlag){
            System.out.println("没找到该元素");
        }*/

        //二分查找
        //前提：所要查找的数组必须有序
        int arr2[] = {-1, -44, -23, -23, 0, 2, 31, 42, 56, 78, 96, 123, 435};

        int dest2 = -243;
        int head = 0;
        int end = arr2.length - 1;
        boolean isFlag2 = true;
        while (head <= end) {
            int mid = (head + end) / 2;
            if (dest2 == arr2[mid]) {
                isFlag2 = false;
                System.out.println("找到了该元素，位置为：" + mid);
                break;
            } else if (dest2 < mid) {
                end = mid - 1;
            } else if (dest2 > mid) {
                head = mid + 1;
            }
        }
        if (head>end) {
            System.out.println("没找到该元素");
        }

    }
}
