package 多线程.exer;

import java.util.concurrent.*;

/**
 * @author Liu
 * @create 2022-10-24-20:14
 * @description:
 */
public class test_03 {

    public static void main(String[] args) {
        //创建线程池
        ExecutorService es = Executors.newFixedThreadPool(3);

        FutureTask<Integer> future1 = new FutureTask<Integer>(new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                int count = isPrime(1, 1000);
                return count;
            }
        });
        FutureTask<Integer> future2 = new FutureTask<Integer>(new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                int count = isPrime(1001, 2000);
                return count;
            }
        });
        FutureTask<Integer> future3 = new FutureTask<Integer>(new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                int count = isPrime(2001, 3000);
                return count;
            }
        });

        es.submit(future1);
        es.submit(future2);
        es.submit(future3);

        try {
            Integer c1 = future1.get();
            Integer c2 = future2.get();
            Integer c3 = future3.get();
            System.out.println(c1 + ":" + c2 + ":" + c3);
            System.out.println(c1 + c2 + c3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } finally {
            es.shutdown();
        }
    }

    public static int isPrime(int start, int end) {
        boolean isFlag;
        int count = 0;
        start = start == 1 ? start + 1 : start;
        for (int i = start; i <= end; i++) {
            isFlag = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isFlag = false;
                    break;
                }
            }
            if (isFlag) {
                count++;
            }
        }
        return count;
    }
}


