package TCPTest;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Liu
 * @create 2022-10-25-16:12
 * @description:
 */
public class ThreadTCP {
    public static void main(String[] args) throws IOException {
        //1.创建服务端Socket
        ServerSocket server = new ServerSocket(9090);
        System.out.println("服务器启动等待输入...");
        while (true) {
            //2.通过Server获取Socket
            Socket socket = server.accept();
            String address = socket.getInetAddress().getHostAddress();

            //3.获取Socket后创建线程
            new Thread(new Runnable() {
                @Override
                public void run() {
                    //通过Socket获取输入对象流
                    InputStream is = null;
                    try {
                        is = socket.getInputStream();
                        //设置缓冲区
                        byte[] bytes = new byte[1024];
                        StringBuffer info = new StringBuffer();
                        int len;
                        while ((len = is.read(bytes)) != -1) {
                            String s = new String(bytes, 0, len);
                            info.append(s);
                        }
                        System.out.println(address+":"+info);
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }

                    //释放资源
                    try {
                        is.close();
                        socket.close();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
