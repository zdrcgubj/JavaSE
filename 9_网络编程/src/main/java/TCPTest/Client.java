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
    public static void main(String[] args) {
        Socket socket = null;
        try {
            socket = new Socket("localhost", 9090);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("请输入...");
            String info = in.next();
            if (info.equals("886")) {
                break;
            }
            createClient(info, socket);
        }
        //关闭socket
        try {
            socket.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static void createClient(String info, Socket socket) {
        //1、创建客户端Socket对象
        OutputStream os = null;
        try {
            //2.通过Socket获取输出流对象
            os = socket.getOutputStream();
            //3、写出
            os.write(info.getBytes());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}
