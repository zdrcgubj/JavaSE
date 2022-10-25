package 泛型;

/**
 * @author Liu
 * @create 2022-10-14-11:29
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
public class 泛型方法 {
    public static void main(String[] args) {
        Demo.show(123);
        Demo.show("123");

    }
}

class Demo {
    //泛型方法
    public static <T> void show(T t) {
        System.out.println();
    }

    //泛型返回值
    public static  <T> T show2(T t){
        return t;
    }
}
