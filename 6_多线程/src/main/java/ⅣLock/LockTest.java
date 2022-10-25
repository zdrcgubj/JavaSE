package ⅣLock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Liu
 * @create 2022-10-23-10:57
 * @description:Lock锁
 */
public class LockTest {
    public static void main(String[] args) {
        Window window = new Window();
        Thread thread1 = new Thread(window, "cxk");
        Thread thread2 = new Thread(window, "c");
        Thread thread3 = new Thread(window, "x");
        Thread thread4 = new Thread(window, "k");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}

class Window implements Runnable {
    private int ticket = 100;

    //创建ReentrantLock对象
    //1.构造中设置为true则为公平锁
   private ReentrantLock lock = new ReentrantLock(true);


    @Override
    public void run() {
        while (true) {
            try {
                //2.调用lock()方法(类似获取同步监视器)
                lock.lock();

                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖了" + ticket-- + "票");
                } else {
                    break;
                }

            } finally {
                //3.调用解锁的方法解锁
                lock.unlock();
            }
        }
    }
}
