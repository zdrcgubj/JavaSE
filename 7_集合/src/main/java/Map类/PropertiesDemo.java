package Map类;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Liu
 * @create 2022-10-16-9:46
 * @description:
 */
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();

       InputStream input = new FileInputStream(".\\7_集合\\src\\main\\java\\Map类\\Demo.properties");
        prop.load(input);//加载流对应的文件
        String name = prop.getProperty("name");
        String password = prop.getProperty("password");
        System.out.println(name+"--->"+password);

    }
}
