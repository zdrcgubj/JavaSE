package 线程池.Exer;

import java.util.concurrent.*;

/**
 * @author Liu
 * @create 2022-10-24-16:00
 * @description:
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        //创建线程池
        ExecutorService es = Executors.newFixedThreadPool(2);

        Future<Integer> future1 = es.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for (int i = 1; i < 501; i++) {
                    sum += i;
                }
                return sum;
            }
        });

        Future<Integer> future2 = es.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for (int i = 501; i < 1001; i++) {
                    sum += i;
                }
                return sum;
            }
        });

        Future<Integer> future3 = es.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for (int i = 1001; i <= 1500; i++) {
                    sum += i;
                }
                return sum;
            }
        });
        try {
            Integer sum1 = future1.get();
            Integer sum2 = future2.get();
            Integer sum3 = future3.get();
            System.out.println(sum1 + sum2 + sum3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } finally {
            es.shutdown();
        }
    }

}
