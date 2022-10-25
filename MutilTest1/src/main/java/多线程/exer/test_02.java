package 多线程.exer;

/**
 * @author Liu
 * @create 2022-10-24-19:49
 * @description:
 */
public class test_02 {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread(new printNum(obj)).start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(new printLetter(obj)).start();


    }

}

class printNum implements Runnable {
    Object obj;
    static int count = 0;

    public printNum(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 52; i++) {
            synchronized (obj) {
                count++;
                System.out.println(i);

                if (count == 2) {
                    count = 0;
                    obj.notify();
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

class printLetter implements Runnable {
    Object obj;

    public printLetter(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        for (int i = 'a'; i <= 'z'; i++) {
            synchronized (obj) {
                System.out.println((char) i);
                obj.notify();
                try {
                    if (i != 'z') {
                        obj.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
