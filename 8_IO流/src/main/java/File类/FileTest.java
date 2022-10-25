package File类;

import org.junit.Test;

import java.io.File;
import java.lang.reflect.Field;

/**
 * @author Liu
 * @create 2022-10-19-20:36
 * @description:
 */
public class FileTest {
    //构造器
    @Test
    public  void test1(){
        //构造器1
        File file1 = new File("hello.txt");
        File file2 = new File("./8_IO流/src/main/resources/aa.txt");

        System.out.println(file1);
        System.out.println(file2);
        //构造器2
        File file3 = new File("./8_IO流/src/main","resources");
        System.out.println(file3);

        //构造器3
        File file4 = new File(file3,"aa.txt");
        System.out.println(file4);
    }
}
