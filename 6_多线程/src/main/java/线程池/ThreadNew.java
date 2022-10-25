package 线程池;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author Liu
 * @create 2022-10-23-16:12
 * @description: 创建线程的方式三:实现Callable接口. -------jdk5增加
 */

public class ThreadNew {
    public static void main(String[] args) {
        //将Callable接口的实现类的对象作为参数FutureTask的构造器中,创建FutureTask对象
        FutureTask<Integer> futureTask = new FutureTask(new Callable() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for (int i = 0; i <= 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                        sum += i;
                    }
                }
                return sum;
            }
        });

        //将FutureTask的对象作为参数传给Thread创造Thread对象
        new Thread(futureTask).start();

        try {
            //get返回值即为FutureTast构造器参数Callable实现类重写的call()方法的返回值
            Integer sum = futureTask.get();
            System.out.println("总和为:" + sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
