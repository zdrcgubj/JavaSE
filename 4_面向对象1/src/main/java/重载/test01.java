package 重载;

/**
 * @author Liu
 * @create 2022-09-30-11:53
 * @description:
 */
public class test01 {
    public static void main(String[] args) {
        test01 test01 = new test01();
        test01.add(12,3);
        test01.add("12","13");
        test01.add(12.3,43.1);
    }

    public void add(String a, String b) {
        System.out.println(a + b);
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(double a, double b) {
        System.out.println(a + b);
    }

}
