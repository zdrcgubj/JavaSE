package 打印流;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * @author Liu
 * @create 2022-10-20-11:42
 * @description:
 */
public class PrintStreamTest {
    @Test
    public void testPrintStream() throws FileNotFoundException {
        //字节打印流
        PrintStream ps = new PrintStream("hello1.txt");

        ps.println(1);
        ps.print(1.2);
        ps.print(false);

        ps.println(new Object());//写入的是对象的地址

        //字符打印流
        PrintWriter pw = new PrintWriter("hello1.txt");
        pw.println(1);
        pw.println("world");

        //关闭流
        ps.close();
        pw.close();

    }
}
