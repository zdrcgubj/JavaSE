package 字节流.文件字节流;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Liu
 * @create 2022-10-19-11:51
 * @description:
 */
public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream("./8_IO流/src/main/resources/aa.txt");

       /* //read()一次读入一个字节
        int read = input.read();
        System.out.println(read);*/

        //read(byte [] b)
        //从流中一次读取自定义缓冲区大小的字节，并返回读取到的字节长度,如果读到流的末尾返回-1

        //自定义缓冲区
/*        byte[] bytes = new byte[1024];
        int len;
        while ((len=input.read(bytes))!=-1){
            String s = new String(bytes, 0, len);
            System.out.println(s);
        }*/

        //read(buf,offset,len);

        //自定义缓冲区
        byte[] bytes = new byte[1024];
        input.read(bytes, 2, 100);
        System.out.println(Arrays.toString(bytes));
    }
}
