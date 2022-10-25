package Ⅱ线程安全问题;

/**
 * @author Liu
 * @create 2022-10-22-16:41
 * @description:
 */
public class TicketThread extends Thread {
    static int ticket = 100;

    @Override
    public  void run() {
        while (true) {
            sale();
        }
    }

    private synchronized static void sale() {//设为静态方法的时候同步监视器为:TicketThread.class
        //private synchronized  void sale()//同步监视器为t1,t2,t3,t4.同步监视器不唯一
        if (ticket <= 0) {
            System.exit(0);
        }
        System.out.println(Thread.currentThread().getName() + "卖了" + ticket-- + "票");
    }
}

class test3 {
    public static void main(String[] args) {
        Thread t1 = new TicketThread();
        Thread t2 = new TicketThread();
        Thread t3 = new TicketThread();
        Thread t4 = new TicketThread();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}
