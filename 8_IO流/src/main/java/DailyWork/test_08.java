package DailyWork;

import org.junit.Test;

import java.io.*;

/**
 * @author Liu
 * @create 2022-10-20-18:59
 * @description:
 */
public class test_08 {
    @Test
    public void test() {
        FileOutputStream fos = null;
        FileInputStream fis = null;
        String path = "src/main/java/DailyWork/dir/test.txt";
        try {
            //创建流
            fos = new FileOutputStream(path, true);
            fis = new FileInputStream(path);
            //写出数据
            fos.write("helloWord".getBytes());

            //读取数据
            //创建缓冲区
            byte[] bytes = new byte[5];
            int len;
            while ((len=fis.read(bytes))!=-1){
                String s=new String(bytes,0,len);
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}
