package 字符流.文件字符流;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Liu
 * @create 2022-10-19-23:21
 * @description: 读入的资源一定要存在, 否则会出现FileNotFoundException
 */
public class FileReaderTest {
    public static void main(String[] args) {
        File file = new File("8_IO流\\hello.txt");
        System.out.println(file.getPath());
    }

    //对read()操作升级:使用read的重载方法
    @Test
    public void testFileReader1() {
        //1.File实例化
        File file = new File("hello.txt");
        //2.创建FileReader对象
        FileReader fr = null;
        try {
            fr = new FileReader(file);


/*            //3数据读入
            //read():返回读入的一个字符.如果达到文件末尾,返回-1
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }*/

    //----------------------------------------------------------------
/*            //3.读入操作:read(char chars)
            //一次读取一个字符数组，并返回读取到的字符的长度，如果读到流的末尾返回-1
            char[] chars = new char[5];
            int len;
            while ((len = fr.read(chars)) != -1) {
                String s = new String(chars,0,len);
                System.out.println(s);
            }*/
    //----------------------------------------------------------------
            //read(char[] ch,int offset,int len)
            //参数2：指定存放在数组中的起始位置       参数3：指定存放字符的长度
            //一次读取一个字符数组，并返回读取到的字符的长度，如果读到流的末尾返回-1
            char[] chars = new char[5];
            fr.read(chars,2,3);
            System.out.println(chars);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            //4关闭流
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }

    @Test
    public void testFileReader() {
        //1实例化File类的对象,指明要操作的文件
        File file = new File("hello.txt");//相较于当前的module

        //2创建流对象
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            //3数据读入
            //read():返回读入的一个字符.如果达到文件末尾,返回-1
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            //4关闭流
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}
