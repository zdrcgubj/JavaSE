package 字符流.文件字符流;

import org.junit.Test;

import java.io.*;

/**
 * @author Liu
 * @create 2022-10-20-0:10
 * @description:
 */
public class 文件复制 {
    @Test
    public void test1() {
        //1创建file类对象
        File file = new File("hello.txt");

        //2创建输入流对象
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(file);
            fw = new FileWriter("src/main/resources/hello.txt");
            //3.创建缓冲区
            char[] chars = new char[1000];
            int len;
            //4.读取文件
            while ((len = fr.read(chars)) != -1) {
                //5.复制文件
                fw.write(chars, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            try {
                //6关闭流
                if (fr != null) {
                    fr.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}
