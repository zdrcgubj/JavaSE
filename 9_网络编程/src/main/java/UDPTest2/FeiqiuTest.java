package UDPTest2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author Liu
 * @create 2022-10-25-16:37
 * @description:
 */
public class FeiqiuTest {
    public static void main(String[] args) throws Exception {
        //创建DatagramSocket
        DatagramSocket ds = new DatagramSocket();
        //创建数据包
        byte[] buf="1:100:gzw:昵称:32:gzw".getBytes("gbk");
        //DatagramPacket dp = new DatagramPacket(buf,buf.length, InetAddress.getByName("192.168.51.2"),2425);
        DatagramPacket dp = new DatagramPacket(buf,buf.length, InetAddress.getByName("192.168.51.2"),2425);
       // DatagramPacket dp = new DatagramPacket(buf,buf.length, InetAddress.getByName("192.168.51.90"),2425);

        //发送数据包
        while (true){
            ds.send(dp);
        }

    }

}
