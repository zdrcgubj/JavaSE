package 字符流.字符缓冲流;

import org.junit.Test;

import java.io.*;

/**
 * @author Liu
 * @create 2022-10-20-11:08
 * @description:
 */
public class BufferedStreamTest {

    @Test
    public void testBufferedWriter() throws IOException {
        //1创建缓冲字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("hello1.txt"));

        //2.通过缓冲流输出内容
        bw.write("Hello");
        //创建新行
        bw.newLine();
        bw.write("Word");

        //3.关闭流
        bw.close();
    }


    @Test
    public void testBufferedReader() throws IOException {
        //字符缓冲流

        //1.创建字符缓冲输入流
        BufferedReader br = new BufferedReader(new FileReader("hello.txt"));

        //2 使用缓冲流读取内容
        //String readLine()
        //一次读取一行内容,读到末尾返回null
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        //3.关闭流
        br.close();
    }

}
