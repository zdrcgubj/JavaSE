package 接口;

/**
 * @author Liu
 * @create 2022-10-10-22:31
 * @description:
 */
public class 接口匿名实现类 {
    public static void main(String[] args) {
        Computer com = new Computer();
/*        //1.创建了接口的非匿名实现类的非匿名对象
        Printer printer = new Printer();
        com.transferData(printer);

        //2. 创建了接口的非匿名实现类的匿名对象
        com.transferData(new Printer());

        //3. 创建了接口的匿名实现类的非匿名对象
        USB phone = new USB() {
            public void start() {
                System.out.println("手机开始工作");
            }

            public void stop() {
                System.out.println("手机停止工作");
            }
        };
        com.transferData(phone);*/

        //4. 创建了接口的匿名实现类的匿名对象
        com.transferData(new USB() {
            public void start() {
                System.out.println("mp3开始工作");
            }

            public void stop() {
                System.out.println("mp3结束工作");
            }
        });

    }
}

class Computer {
    public void transferData(USB usb) {
        usb.start();

        System.out.println("具体传输数据的细节");

    }
}

class Printer implements USB {

    public void start() {
        System.out.println("打印机开启工作");
    }

    public void stop() {
        System.out.println("打印机结束工作");
    }
}

interface USB {
    //常量：定义了长、宽、最大最小的传输速度等

    void start();

}