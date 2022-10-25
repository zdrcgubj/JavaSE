package ArrayDemo._1一维数组;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Liu
 * @create 2022-09-27-19:36
 * @description:实现商品的增删改查
 */
public class 综合案例 {
    //商品信息数组
    static String[] product = new String[]{};
    //定义有效长度
    static int size = 0;

    static Scanner in = new Scanner(System.in);

    //增加商品
    public static void add(String name) {
        //判断数组容量是否足够
        if (size == product.length) {
            product = Arrays.copyOf(product, (product.length + 5));
        }
        //判断商品是否存在
        if (isExist(name) != -1) {
            System.out.println("该商品已经存在，无法添加！");
        } else {
            product[size] = name;
            size++;
            System.out.println("添加成功");
        }
    }

    //删除商品
    public static void del(String name) {
        //商品是否存在
        if(isExist(name)==-1){
            System.out.println("商品不存在无法删除");
            return;
        }
        //有效长度为5的倍数时增加长度
        if(size%5==0){
            product=Arrays.copyOf(product,product.length+5);
        }
        //删除原数组的商品 i+1将i的位置覆盖掉
        for (int i = 0; i < size; i++) {
            product[i]=product[i+1];
        }
        System.out.println("删除成功");
        //删除完成
        size--;

    }

    //修改商品
    public static void update(String name) {
        if (isExist(name) == -1) {
            System.out.println("商品不存在无法修改");
        } else {
            System.out.println("请输入修改后的商品名称");
            String newProductName=in.next();
            product[isExist(name)] = newProductName;
            System.out.println("修改成功");
        }

    }

    //查询商品
    public static void query() {
        for (int i = 0; i < size; i++) {
            System.out.print(product[i] + "\t");
        }
        System.out.println();
    }

    public static int isExist(String name) {
        for (int i = 0; i < size; i++) {
            //存在则返回索引
            if (name.equals(product[i])) {
                return i;
            }
        }
        return -1;
    }

    public static void index() {
        while (true) {
            System.out.println("请选择操作");
            System.out.println("1.添加商品 2.删除商品 3.修改商品 4.查询商品 5.退出");
            int option = in.nextInt();
            switch (option) {
                case 1:
                    System.out.println("请输入要添加的商品");
                    String name = in.next();
                    add(name);
                    break;
                case 2:
                    System.out.println("请输入要删除的商品");
                    String delProduct=in.next();
                    del(delProduct);
                    break;
                case 3:
                    System.out.println("请输入要修改的商品");
                    String productName=in.next();
                    update(productName);
                    break;
                case 4:
                    query();
                    break;
                case 5:
                    System.out.println("欢迎下次使用");
                    System.exit(0);
                default:
                    System.out.println("非法输入！");
            }
        }

    }

    public static void main(String[] args) {
        index();
    }
}
