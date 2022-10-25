package TCPTest;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Liu
 * @create 2022-10-25-14:03
 * @description:
 */
public class Server {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        Callable<Object> thread = new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                while (true) {
                    String info = createCon(9090);
                    if (info.equals("886")) {
                        System.out.println("会话结束!");
                        break;
                    }
                    System.out.println(info);
                }
                return null;
            }
        };
        es.submit(thread);

        es.shutdown();
    }

    public static String createCon(int targetPort) {
        InputStream is = null;
        ServerSocket server = null;
        String info = "";
        //1、创建服务端ServerSocket对象
        try {
            server = new ServerSocket(targetPort);
            System.out.println("Server等待连接中....");
            //2、通过ServerSocket对象获取Socket对象
            Socket socket = server.accept();//阻塞式方法
            //3.通过Socket对象获取输入流
            is = socket.getInputStream();

            byte[] bytes = new byte[1024];
            int len;
            while ((len = is.read(bytes)) != -1) {
                String s = new String(bytes, 0, len);
                info += s;
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            try {
                is.close();
                server.close();
                return info;
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        return "";
    }
}
