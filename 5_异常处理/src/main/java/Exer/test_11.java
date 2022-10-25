package Exer;

/**
 * @author Liu
 * @create 2022-10-18-20:24
 * @description:
 */
public class test_11 {

    public static void main(String args[]){

        try{

            ma();

        }catch(Exception ex1){

        }

    }

    public static void ma() throws Exception {

        int n = 10;

        int b=0;

        //读入一个整数 b

        try{

            System.out.println("ma1");

            int result = n / b;

            System.out.println("ma2 " + result);

        }finally{

            System.out.println("In Finally");

        }

    }

}
