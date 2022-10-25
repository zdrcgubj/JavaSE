package Exer;

/**
 * @author Liu
 * @create 2022-10-18-18:26
 * @description:
 */
import java.io.*;

import java.sql.*;

public class test_04 {

    public static void main(String args[]){

        System.out.println("main 1");

        int n=5;

        //读入 n

        ma(n);

        System.out.println("main2");
    }

    public static void ma(int n){

        try{

            System.out.println("ma1");

            mb(n);

            System.out.println("ma2");

        }catch(EOFException e){

            System.out.println("Catch EOFException");

        }catch(IOException e){

            System.out.println("Catch IOException");

        }catch(SQLException e){

            System.out.println("Catch SQLException");

        }catch(Exception e){

            System.out.println("Catch Exception");

        }finally{

            System.out.println("In finally");

        }

    }

    public static void mb(int n) throws Exception{

        System.out.println("mb1");

        if (n == 1) throw new EOFException();

        if (n == 2) throw new FileNotFoundException();

        if (n == 3) throw new SQLException();

        if (n == 4) throw new NullPointerException();

        System.out.println("mb2");

    }

}
