package File类;

import java.io.File;
import java.util.Arrays;

/**
 * @author Liu
 * @create 2022-10-19-21:29
 * @description:
 */
public class FileTest2 {
    public static void main(String[] args) {
        File file = new File(".\\8_IO流\\src\\main\\resources\\aa.txt");
//        String path = file.getPath();
//        System.out.println(path);
//        String absolutePath = file.getAbsolutePath();
//        System.out.println(absolutePath);

        File file1 = new File("E:\\Idea\\JavaWorkplace\\com_java_l\\myProj\\8_IO流");
        String[] list = file1.list();
        for (String s : list) {
            System.out.println(s);
        }

        File[] files = file1.listFiles();
        for (File s : files) {
            System.out.println(s);
        }
    }
}
