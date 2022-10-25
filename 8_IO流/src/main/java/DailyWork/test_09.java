package DailyWork;

import org.junit.Test;

import java.io.*;

/**
 * @author Liu
 * @create 2022-10-20-19:14
 * @description:
 *
 *
 */

class st implements Serializable{


}
public class test_09 {

    @Test
    public void test1() {
        String path = "src/main/java/DailyWork/dir";
        DataOutputStream dop = null;
        DataInputStream dis=null;
        //判断文件是否存在
        File file = new File(path, "test.dat");

        try {
            if(!file.exists()){
                //创建文件
                //创建流对象
                dop = new DataOutputStream(new FileOutputStream(file));
                dop.writeLong(10000);
            }else {
                //读取数据
                 dis= new DataInputStream(new FileInputStream(file));

                long l = dis.readLong();
                System.out.println(l);
                dop=new DataOutputStream(new FileOutputStream(file));
                dop.writeLong(++l);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            try {
                if (dop != null) {
                    dop.close();
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}
