import java.text.SimpleDateFormat;
import java.util.HashMap;

/**
 * @author Liu
 * @create 2022-10-18-9:17
 * @description:
 */
class MyThread extends Thread{
    private String data;
    public MyThread(String data){
        this.data = data;
    }
    public synchronized void run(){
        for(int i = 0; i<100; i++){
            System.out.println(data);
        }
    }
}
 class TestMyThread{
    public static void main(String args[]){
        Thread t1 = new MyThread("“aaa”");
        Thread t2 = new MyThread("“bbb”");
        t1.start();
        t2.start();
    }
}
