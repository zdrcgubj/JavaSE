package Ⅱ线程安全问题;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Liu
 * @create 2022-10-23-9:52
 * @description:银行有一个账户. 有两个储户分别向同一个账户存3000元, 每次存储1000, 存3次.每次存完打印账户余额.
 * 问:该程序是否有安全问题,如果有如何解决
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        Thread thread1 = new Thread(new Depositor(account), "储户A");
        Thread thread2 = new Thread(new Depositor(account), "储户B");

        thread1.start();
        thread2.start();
    }
}


class Depositor implements Runnable {
    private Account account;

    public Depositor(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            double balance = account.deposit(1000);
            System.out.println(Thread.currentThread().getName() + "存储了:" + "账户余额为" + balance);
        }
    }
}


class Account {
    private double balance = 0.0;

    ReentrantLock lock = new ReentrantLock();

    public double deposit(double bal) {
        try {
            //调用lock()方法
            lock.lock();
            balance += bal;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return balance;
        } finally {
            //解锁
            lock.unlock();
        }
    }
}
