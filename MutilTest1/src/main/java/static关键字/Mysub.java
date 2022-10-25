package static关键字;

/**
 * @author Liu
 * @create 2022-10-09-14:51
 * @description:
 */
public class Mysub extends Super{

    static {
        System.out.println("子类静态代码块");
    }

    {
        System.out.println("子类代码块1");
    }

    {
        System.out.println("子类代码块2");
    }

    public Mysub() {
        System.out.println("子类构造方法");
    }

}

class test{
    public static void main(String[] args) {
        Mysub mysub = new Mysub();
    }
}
