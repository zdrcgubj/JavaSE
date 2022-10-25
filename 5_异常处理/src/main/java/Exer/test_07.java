package Exer;

/**
 * @author Liu
 * @create 2022-10-18-20:01
 * @description:
 */
class MyException extends Exception{}

class TestException{

    public static void main(String args[]){

        ma();

    }

    public static int ma(){

        try{

            m();

            return 100;

        }catch(Exception e){

            System.out.println("Exception");

        }

//        catch(ArithmeticException e){
//
//            System.out.println("ArithmeticException");
//
//        }
        return 0;

    }

    public static void m() throws MyException {

        throw new MyException();

    }

}