package Ⅲ线程死锁;

/**
 * @author Liu
 * @create 2022-10-22-17:47
 * @description:
 */
public class 死锁Test1 {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();

        new Thread() {
            @Override
            public void run() {
                this.setName("线程1");
                System.out.println(Thread.currentThread().getName());
                synchronized (s1) {
                    s1.append("a");
                    s2.append(1);

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (s2) {
                        s1.append("b");
                        s2.append(2);

                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("线程2");
                System.out.println(Thread.currentThread().getName());
                synchronized (s2) {
                    s1.append("c");
                    s2.append(3);

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (s1) {
                        s1.append("d");
                        s2.append(4);

                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }
            }
        }).start();
        //线程1 拿到s1等待s2
        //线程2 拿到s2等待s1
        //造成死锁
    }
}
