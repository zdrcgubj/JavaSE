package Ⅴ线程通信;

/**
 * @author Liu
 * @create 2022-10-23-14:16
 * @description: 生产者(Productor)将产品交给店员(Clerk), 而消费者(Customer)从店员取走产品, 店员一次只能持有固定数量的产品(比如 : 20),
 * 如果生产者试图生产更多的产品,店员会叫生产者停一下,如果店中有空位了再通知生产者继续生产产品;如果店中没有产品,店员会告诉消费者
 * 等一下,如果店中有了产品再通知消费者取走产品
 */
public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Thread thread1 = new Thread(new Productor(clerk), "生产者");
        Thread thread2 = new Thread(new Customer(clerk), "消费者");

        thread1.start();
        thread2.start();
    }

}

class Clerk {
    int restProduct = 0;

    public synchronized void addProduct() {
        if (restProduct < 20) {
            //当产品数大于15时唤醒消费者
            if (restProduct > 15) {
                notify();

            }
            System.out.println(Thread.currentThread().getName() + "开始生产第" + ++restProduct + "个产品");
            System.out.println(Thread.currentThread().getName() + "开始生产第" + ++restProduct + "个产品");
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void sellProduct() {
        if (restProduct > 0) {
            //当剩余产品小于5时唤醒生产者
            if (restProduct < 5) {
                notify();
            }
            System.out.println(Thread.currentThread().getName() + "开始消费第" + restProduct-- + "个产品");
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}

class Productor implements Runnable {
    private Clerk clerk;

    public Productor(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("生产者开始生产");
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.addProduct();
        }

    }

}

class Customer implements Runnable {
    private Clerk clerk;

    @Override
    public void run() {
        System.out.println("消费者开始消费");
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.sellProduct();
        }

    }

    public Customer(Clerk clerk) {
        this.clerk = clerk;
    }
}
