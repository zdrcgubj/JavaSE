package TCPTest;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Liu
 * @create 2022-10-25-14:03
 * @description:
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        while (true) {
            //1、创建客户端Socket对象
            Socket socket = new Socket("localhost", 9090);
            //2.通过Socket获取输出流对象
            OutputStream os = socket.getOutputStream();
            System.out.println("请输入...");
            String info = in.next();
            //3、写出
            os.write(info.getBytes());
            if (info.equals("886")) {
                break;
            }

            //关闭socket
            try {
                os.close();
                socket.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}
