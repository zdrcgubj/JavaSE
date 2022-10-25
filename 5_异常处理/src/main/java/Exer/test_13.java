package Exer;

/**
 * @author Liu
 * @create 2022-10-18-20:30
 * @description:
 */
public class test_13 {

    public static void main(String args[]){

        try{

            System.out.println("main1");

            ma();

            System.out.println("main2");

        }catch(Exception e){

            System.out.println("In Catch");

        }

    }

    public static void ma(){

        System.out.println("ma1");

        throw new NullPointerException();

    //    System.out.println("ma2");

    }

}
