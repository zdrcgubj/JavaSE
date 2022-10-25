package DailyWork;

import org.junit.Test;
import sun.nio.cs.ext.GBK;

import java.io.*;
import java.util.ArrayList;
import java.util.UUID;

/**
 * @author Liu
 * @create 2022-10-20-19:49
 * @description:
 */

public class test_14  {
    @Test
    public  void test1(){
        String path = "src/main/java/DailyWork/";
        ArrayList<String> list = new ArrayList<>();

        BufferedReader br=null;
        BufferedWriter bw=null;
        try {
            //转换为字符输入流
            br= new BufferedReader(new InputStreamReader(new FileInputStream(path+"test.txt"),"GBK"));
            bw= new BufferedWriter(new FileWriter(path+"/test2.txt"));
            String line;
            while ((line=br.readLine())!=null){
                System.out.println(line);
                //添加到list
                list.add(line);
            }
            //写入到test2
            for (int i = list.size() - 1; i >= 0; i--) {
                bw.write(list.get(i));
                bw.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }finally {

                try {
                    if (br != null) {
                        br.close();
                    }
                    if (bw != null) {
                        bw.close();
                    }
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }
    }
}
