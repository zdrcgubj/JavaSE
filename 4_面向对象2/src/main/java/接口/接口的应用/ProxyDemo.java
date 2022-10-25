package 接口.接口的应用;

/**
 * @author Liu
 * @create 2022-10-13-13:28
 * @description:
 */
interface Network {
    public void browse();
}

//被代理类
class Server implements Network {

    @Override
    public void browse() {
        System.out.println("真实的服务器访问网络!");
    }
}

//代理类
class ProxyServer implements Network {
    Network net;

    public ProxyServer(Network net) {
        this.net = net;
    }

    public void check(Network net) {
        System.out.println("检查网络连接状态");
        net.browse();
    }

    @Override
    public void browse() {
        check(net);
    }
}


public class ProxyDemo {
    public static void main(String[] args) {
        Server server = new Server();
        //自身不调用,通过代理调用
        ProxyServer proxy = new ProxyServer(server);

        proxy.browse();
    }
}
