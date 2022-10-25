package 多线程.exer;

/**
 * @author Liu
 * @create 2022-10-24-19:29
 * @description:现在有A1、A2、A3三个线程(分别打印0~10、11~20、21~30)，你怎样保证A2在A1执行完后执行，A3在A2执行完后执行？
 */
public class test_01 {
    public static void main(String[] args) {
        Thread t1 = new Mythead1("线程A1");
        Thread t2 = new Mythead2("线程A2");

        new Thread("线程A3"){
            @Override
            public void run() {
                t1.start();
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                t2.start();
                try {
                    t2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 21; i <= 30; i++) {
                    System.out.println(Thread.currentThread().getName() + "--->" + i);
                }
            }
        }.start();


    }
}

class Mythead1 extends Thread {
    public Mythead1(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}

class Mythead2 extends Thread {
    public Mythead2(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}