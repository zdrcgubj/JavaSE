package ArrayDemo._1一维数组;

import java.util.Scanner;

/**
 * @author Liu
 * @create: 2022-06-23-14:41
 * 一维数组：
 * 从键盘读入学生成绩，找出最高分，
 * 并输出学生成绩等级。
 * 成绩>=最高分-10 等级为’A’
 * 成绩>=最高分-20 等级为’B’
 * 成绩>=最高分-30 等级为’C’
 * 其余 等级为’D’
 * 提示：先读入学生人数，根据人数创建int数组，
 * 存放学生成绩。
 * eg：56 74 89 41 89
 */
public class ArrayDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入学生的人数：");
        int max = Integer.MIN_VALUE;
        int snum = in.nextInt();  //学生人数
        int[] stu = new int[snum];  //建int数组
        System.out.println("请输入" + snum + "个成绩：");

        for (int i = 0; i < snum; i++) {
            int score = in.nextInt();
            stu[i] = score;
            if (stu[i] > max) {
                max = stu[i];
            }
        }
//
//        for (int i = 0; i < stu.length; i++) {
//            if (stu[i] > max) {
//                max = stu[i];
//            }
//        }
        System.out.println("最高成绩是:");
        System.out.println(max);
        for (int i = 0; i < stu.length; i++) {
            if (stu[i] >= max - 10) {
                System.out.println("student" + i + "score is" + stu[i] + "is A");
            } else if (stu[i] >= max - 20) {
                System.out.println("student" + i + "score is" + stu[i] + "is B");
            } else if (stu[i] >= max - 30) {
                System.out.println("student" + i + "score is" + stu[i] + "is C");
            } else {
                System.out.println("student" + i + "score is" + stu[i] + "is D");
            }
        }

    }

}
