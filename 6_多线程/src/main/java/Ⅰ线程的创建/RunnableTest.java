package Ⅰ线程的创建;

/**
 * @author Liu
 * @create 2022-10-22-10:50
 * @description:
 */

class MyRunnable1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
public class RunnableTest {
    public static void main(String[] args) {
        //创建实现类对象
        MyRunnable1 m1 = new MyRunnable1();
        //将此对象作为参数传递到Thread的构造器中,创建Thread类的对象
        Thread thread = new Thread(m1);
        //启动线程
        thread.start();
    }
}
