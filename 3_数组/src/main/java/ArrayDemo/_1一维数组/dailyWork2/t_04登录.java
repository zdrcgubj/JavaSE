package ArrayDemo._1一维数组.dailyWork2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Liu
 * @create 2022-09-29-10:38
 * @description:
 */
public class t_04登录 {

    public static String[][] register(String[][] users) {

        Scanner scanner = new Scanner(System.in);
        //数组扩容
        users = Arrays.copyOf(users, users.length + 1);
        int index = users.length - 1;
        //内层初始化
        users[users.length - 1] = new String[2];
        System.out.println("请输入用户名：");
        users[index][0] = scanner.next();
        System.out.println("请输入密码：");
        users[index][1] = scanner.next();

        for (int i = 0; i < users.length; i++) {
            System.out.print("[");
            for (int j = 0; j < users[i].length; j++) {
                System.out.print(users[i][j]);
                if (j != users.length - 1) {
                    System.out.print(",");
                }
            }
            System.out.print("]");
            System.out.println();
        }
        return users;
    }


    public static void login(String[][] users) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("请输入用户名：");
            String uname = in.next();
            System.out.println("请输入密码：");
            String pwd = in.next();
            boolean isFllag=false;//默认不存在
            for (int i = 0; i <users.length ; i++) {
                if(uname.equals(users[i][0])){
                    isFllag=true;
                    break;
                }
            }
            if(!isFllag){
                System.out.println("用户不存在，请先注册");
                return;
            }

            for (int i = 0; i < users.length; i++) {
                if (uname.equals(users[i][0]) && pwd.equals(users[i][1])) {
                    System.out.println("登录成功");
                    return;
                }
            }
            System.out.println("账户或密码错误请重新输入");
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] users = new String[1][2];
        users[0][0] = "gzw";
        users[0][1] = "123456";
        while (true){
            System.out.println("请输入操作：");
            System.out.println("1 注册 2 登录 0 退出");
            int option = in.nextInt();
            if(option==0){
                break;
            }
            switch (option) {
                case 1:
                    users=register(users);
                    break;
                case 2:
                    login(users);
                    break;
                default:
                    System.out.println("请选择有效操作");
            }
        }

    }
}
