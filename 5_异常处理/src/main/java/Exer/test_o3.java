package Exer;

/**
 * @author Liu
 * @create 2022-10-18-18:17
 * @description:
 */
public class test_o3 {

    public static void main(String args[]){

        throwException(10);
    }

    public static void throwException(int n){

        if (n == 0){

            throw new NullPointerException("空指针异常");
            //抛出一个 NullPointerException

        }else{

            //抛出一个 ClassCastException
            throw  new ClassCastException("类型转换出错");
            //并设定详细信息为“类型转换出错”

        }
    }
}

