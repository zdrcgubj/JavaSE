package Ⅱ线程安全问题;

/**
 * @author Liu
 * @create 2022-10-21-17:13
 * @description:
 */
public class TicketRunnable implements Runnable {
    int ticket = 100;//创建的是同一个对象,Thread创建时共享ticket

    @Override
    public void run() {
        while (true) {
            // sale();
            synchronized (TicketRunnable.class) {
                if (ticket <= 0) {
                    System.exit(0);
                }
                System.out.println(Thread.currentThread().getName() + "卖了" + ticket-- + "票");
            }
        }
    }

//    public synchronized void sale() {
//        if (ticket <= 0) {
//            System.exit(0);
//        }
//        System.out.println(Thread.currentThread().getName() + "卖了" + ticket-- + "票");
//    }
}

class test {
    public static void main(String[] args) {
        TicketRunnable ticket = new TicketRunnable();
        Thread t1 = new Thread(ticket);
        Thread t2 = new Thread(ticket);
        Thread t3 = new Thread(ticket);
        Thread t4 = new Thread(ticket);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}