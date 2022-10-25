import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author Liu
 * @create 2022-10-25-11:37
 * @description:
 */
public class Ipdemo {
    public static void main(String[] args) throws UnknownHostException {
        //
        InetAddress localHost=InetAddress.getLocalHost();
        //获得主机IP
        String hostAddress = localHost.getHostAddress();
        System.out.println(hostAddress);
    }
}
