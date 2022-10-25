package Ⅰ线程的创建;

/**
 * @author Liu
 * @create 2022-10-22-9:09
 * @description:
 */
public class ThreadTest2 {
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2("线程1");


        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }

            if(i==20){
                myThread2.start();
                try {
                    myThread2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }

    public MyThread2(String name) {
        super(name);
    }
}
