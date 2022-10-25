package 接口与内部类;

interface ServiceInterface{

    void doService1();

    void doService2();

    void doService3();

}
abstract class AbstractService implements ServiceInterface{

    public void doService1(){}

    public void doService2(){}

    public void doService3(){}

}
class MyService extends AbstractService  {

}
public class index2 {
    public static void main(String[] args) {

    }
}