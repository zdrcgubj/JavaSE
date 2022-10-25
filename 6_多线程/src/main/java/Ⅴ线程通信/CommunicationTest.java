package Ⅴ线程通信;

/**
 * @author Liu
 * @create 2022-10-23-13:19
 * @description:线程通信案例:使用两个线程打印1-100.线程1,线程2交替打印
 */

class Number implements Runnable {
    int num = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (Number.class) {
                //唤醒一个正在等待的其他线程
               Number.class.notify();

                if (num <= 100) {
                    System.out.println(Thread.currentThread().getName() + "打印了:" + num++);
                } else {
                    break;
                }

                //使得调用wait()方法的线程进入阻塞状态
                try {
                    Number.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class CommunicationTest {
    public static void main(String[] args) {
        Number number = new Number();
        Thread thread1 = new Thread(number, "线程1");
        Thread thread2 = new Thread(number, "线程2");

        thread1.start();
        thread2.start();
    }
}
