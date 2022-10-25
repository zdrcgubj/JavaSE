package Exer;

/**
 * @author Liu
 * @create 2022-10-18-19:41
 * @description:
 */
public class test_06 {

    public static void main(String args[]) {

        int n = 1;

        //读入 n

        try {

            m(n);

        } catch (MyException1 ex1) {
            ex1.printStackTrace();

            //输出 ex1 详细的方法调用栈信息

        } catch (MyException2 ex2) {
            ex2.printStackTrace();
            //输出 ex2 的详细信息

            //并把 ex2 重新抛出

        }

    }

    public static void m(int n) throws  MyException1 ,MyException2{ //声明抛出 MyException1
        if (n == 1) {
            throw new MyException1("n==1");
            //抛出 MyException1
            //并设定其详细信息为“n == 1”

        } else {
            throw  new MyException2("n==2");
            //抛出 MyException2

            //并设定其详细信息为“n == 2”

        }
    }
}
