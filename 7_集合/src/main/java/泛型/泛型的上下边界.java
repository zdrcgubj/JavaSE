package 泛型;

import java.util.List;

/**
 * @author Liu
 * @create 2022-10-14-11:43
 * @description:
 * 泛型的上下边界:
 *  现阶段使用泛型,泛型的类型是没有任何限制的.如果希望对类型有一定的约束,那么可以定义泛型的上下边界
 *  ?:表示不确定泛型.当?没有指定边界时,其实就是表示Object类
 *
 *  定义上边界:? extends 指定类型
 *              表示泛型必须是指定类型或其子类
 *  定义下边界:? super 指定类型
 *             表示泛型必须是指定类型或其父类
 */
public class 泛型的上下边界 {
    public static void main(String[] args) {

    }

    public static void test01(List<?> list) {  //表示Object
        System.out.println(list);
    }

    public static void test02(List<? extends Number> list) {  //<=Number
        System.out.println(list);
    }

    public static void test03(List<? super Number> list) {  //>=Number
        System.out.println(list);
    }

    public static <T> void test04(List<? extends Comparable<T>> list) {  //表示实现Comparable接口
        System.out.println(list);
    }
}
