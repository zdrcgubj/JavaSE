/**
 * @author Liu
 * @create 2022-10-26-11:16
 * @description:
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {


        /*获取类对象的三种方式
         *      方式1:通过getClass()方法
         *      方式2:通过类.Class
         *
         * */

        //获取类对象的全限定名
        Class<?> c = Class.forName("User");
        //获取对象名
        System.out.println(c.getSimpleName());


        //通过类对象获取类的对象
        User user = (User) c.newInstance();

    }
}

class User {
    String name;

    public User(String name) {
        this.name = name;
    }
}
