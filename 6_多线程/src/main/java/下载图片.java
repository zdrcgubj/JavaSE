import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @author Liu
 * @create 2022-10-24-22:25
 * @description:
 */
//实现多线程下载图片
public class 下载图片 extends Thread {
    private String url;
    private String name;

    public 下载图片(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url, name);
        System.out.println("下载了文件名为:" + name);
    }

    public static void main(String[] args) {
        下载图片 t1 = new 下载图片("https://dl.zhutix.net/2017/03/yudipi_lan_02.jpg", "8_IO流/1.jpg");
        t1.start();
    }
}

//下载器
class WebDownloader {
    public void downloader(String url, String name) {
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (IOException ioException) {
            ioException.printStackTrace();
            System.out.println("IO异常,downloader方法出现问题");
        }
    }
}