package 线程池;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Liu
 * @create 2022-10-24-11:37
 * @description:
 */
public class ThreadPool {
    public static void main(String[] args) {
        //创建包含3个线程对象的线程池
        ExecutorService es = Executors.newFixedThreadPool(3);

        es.isShutdown();
        //提交线程任务
        Mytask mytask1 = new Mytask();
        es.submit(mytask1);

        Mytask mytask2 = new Mytask();
        es.submit(mytask2);

        Mytask mytask3 = new Mytask();
        es.submit(mytask3);

        Mytask mytask4 = new Mytask();
        es.submit(mytask4);

        es.shutdown();

    }
}

class Mytask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() +"---"+ i);
        }
    }
}
