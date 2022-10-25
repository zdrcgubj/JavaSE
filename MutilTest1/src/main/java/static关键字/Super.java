package static关键字;

/**
 * @author Liu
 * @create 2022-10-09-14:55
 * @description:
 */
public class Super {
    {
        System.out.println("父类代码块1");
    }

    {
        System.out.println("父类代码块2");
    }

    static {
        System.out.println("父类静态代码块");
    }

    public Super() {
        System.out.println("父类的构造");
    }
}
