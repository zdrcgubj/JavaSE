package 字符流.文件字符流;

import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Liu
 * @create 2022-10-19-23:59
 * @description:从内存中写出数据到硬盘的文件
 */
public class FileWriterTest {
    @Test
    public void testFileWriter() throws IOException {
        //1创建file类对象
        File file = new File("hello1.txt");
        //2.创建FileWriter对象
        FileWriter fw = new FileWriter(file);

        /**
         * write(String str)
         * write(char[] ch)
         *   写入一个字符串
         */
        fw.write("I have a dream!\n");
        fw.write("you need to have a dream");

        //----------------------------------------------------------------

        /**
         * write(char[] ch,int offset,int len)
         * write(String[] str,int offset,int len)
         * 		参数2：可以指定数组的起始位置      参数3：可以指定写入的字符长度
         *   写入一个字符数组
         */
        fw.write("you need to have a dream", 4, 5);
        fw.write(new char[]{'你', '真', '的', '好', '棒'}, 0, 4);

        if (fw != null) {
            fw.close();
        }
    }
}
