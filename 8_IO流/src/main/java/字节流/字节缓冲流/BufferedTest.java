package 字节流.字节缓冲流;

import java.io.*;

/**
 * @author Liu
 * @create 2022-10-19-14:37
 * @description:
 */
public class BufferedTest {
    public static void main(String[] args) throws IOException {
        //创建缓冲流输入流对象
/*        FileInputStream fis = new FileInputStream("./8_IO流/src/main/resources/aa.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);


        //缓冲区
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            String s = new String(bytes, 0, len);
            System.out.println(s);
        }

        //关闭流
        fis.close();
        bis.close(); */

        //1、将文件输出流创建成缓冲流
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("./8_IO流/src/main/resources/bb.txt", true));//设置为true则关闭覆写

        //2、通过缓冲流写入内容
        bos.write("你好".getBytes());
        bos.write("缓冲流".getBytes());

        //刷新(将缓冲区的内容刷新到目的地(硬盘))
        bos.flush();

        //3.关闭流资源
        //关闭流资源的时候，会自动刷新缓冲区内容。(只会刷新一次)
        bos.close();

    }
}
