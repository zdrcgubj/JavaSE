package Ⅰ线程的创建;

/**
 * @author Liu
 * @create 2022-10-21-20:17
 * @description:
 */
class MyThread extends Thread {
    //重写父类的run方法(线程的逻辑代码)
    @Override
    public void run() {
        this.setName("子线程");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                //Thread.currentThread()获取当前线程对象    getName();  获取线程的名称
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

public class ThreadTest1 {
    public static void main(String[] args) {
/*        //创建Thread类的子类对象
        MyThread myThread = new MyThread();
        myThread.setName("子线程");

        //start():①启动线程  ②调用当前线程的run()
        myThread.start();*/
        // new MyThread().start();

        //创建Thread的匿名子类
        new Thread() {
            @Override
            public void run() {
                this.setName("子线程=======");
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0) {
                        //Thread.currentThread()获取当前线程对象    getName();  获取线程的名称
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }.start();


        Thread.currentThread().setName("主线程");
        for (int i = 'a'; i < 'z'; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + (char) i);
        }
    }
}
