import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author Liu
 * @create 2022-10-25-11:37
 * @description:
 * IP:唯一的标识 Internet上的计算机(通信实体)
 * 在java中使用InetAddress类代表ip
 */
public class Ipdemo {
    public static void main(String[] args) throws UnknownHostException {
        //
        InetAddress localHost=InetAddress.getLocalHost();
        System.out.println(localHost);
        //获得主机IP
        String hostAddress = localHost.getHostAddress();
        System.out.println(hostAddress);

        InetAddress byName = InetAddress.getByName("www.vip.com");
        System.out.println(byName);
    }
}
