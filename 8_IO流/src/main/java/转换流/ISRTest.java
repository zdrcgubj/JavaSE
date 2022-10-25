package 转换流;

import org.junit.Test;
import sun.nio.cs.ext.GBK;

import java.io.*;

/**
 * @author Liu
 * @create 2022-10-20-11:22
 * @description:
 */
public class ISRTest {
    @Test
    public void testInputStreamReader() throws IOException {
/*        //转换流:字节流转换成字符流
          FileInputStream fis = new FileInputStream("hello.txt");

        //通过转换流将字节流转换成字符流
        InputStreamReader isr = new InputStreamReader(fis);

        //通过字符流包装成字符缓冲流
        BufferedReader br = new BufferedReader(isr);*/
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("hello.txt"),"GBK"));//指定编码格式

        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
    }
}
