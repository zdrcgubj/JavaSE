package 字节流.文件字节流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Liu
 * @create 2022-10-19-19:27
 * @description:
 */
public class FileOutputStreamTest {
    public static void main(String[] args) {
        //创建输出流对象
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("./8_IO流/src/main/resources/bb.txt");
            //通过流对象进行写入

            //write(int b):一次写入一个字节，整数表示这个字节对应ASCII码值
            fos.write(97);

            //write(byte[] b):一次写入一个字节数组的内容
            fos.write("你好输出流".getBytes());

            //write(byte[] b,int off,int len):
            //参数2：从数组的指定位置开始  参数3：执行写出的字节个数
            byte[] b = "你好输出流".getBytes();
            fos.write(b, 0, b.length);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            //关闭流
            try {
                fos.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}
