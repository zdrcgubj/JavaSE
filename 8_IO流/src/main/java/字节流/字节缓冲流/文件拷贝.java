package 字节流.字节缓冲流;

import java.io.*;

/**
 * @author Liu
 * @create 2022-10-19-16:01
 * @description:
 */
public class 文件拷贝 {

    public static void main(String[] args) {
        copy1();
        copy2();
    }

    public static void copy1() {
        long start = System.currentTimeMillis();

        //创建输入流
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("D:\\AliDownload\\pycharm-professional-2021.3.zip");
            fos = new FileOutputStream("D:\\AliDownload\\OVF\\1.zip");
            //创建缓冲区
            byte[] bytes = new byte[1024];
            int len;
            //读取文件
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            //关闭流
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }

            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void copy2() {
        long start = System.currentTimeMillis();
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            //创建缓冲流
            bis = new BufferedInputStream(new FileInputStream("D:\\AliDownload\\pycharm-professional-2021.3.zip"));
            bos = new BufferedOutputStream(new FileOutputStream("D:\\AliDownload\\OVF\\2.zip"));

            //创建缓冲区
            byte[] bytes = new byte[1024];
            int len;

            //读入流
            while ((len=bis.read(bytes)) != -1) {
                //复制
                bos.write(bytes,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            //关闭流
            try {
                if (bis != null) {
                    bis.close();
                }
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
