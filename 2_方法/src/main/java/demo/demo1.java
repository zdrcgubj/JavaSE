package demo;

/**
 * @author Liu
 * @create 2022-09-26-14:58
 * @description:
 */
public class demo1 {
    public static void main(String[] args) {
        //九九();
        //isTriangle(4,5,6);
        calcProduct(5,1);
    }

    public static void 九九() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "×" + i + "=" + i * j + " ");
            }
            System.out.println();
        }
    }

    public static void isTriangle(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("能构成三角形");
        }else {
            System.out.println("不能构成三角形");
        }
    }
    public static void calcProduct(int nums,int kinds){
        System.out.println("请输入商品数量和类型 （1苹果，2香蕉，3橘子");
        switch (kinds){
            case 1:
                System.out.println(nums*3.5);
                break;
            case 2:
                System.out.println(nums*4);
                break;
            case 3:
                System.out.println(nums*5);
                break;
        }
    }


}

