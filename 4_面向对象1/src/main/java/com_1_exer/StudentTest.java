package com_1_exer;

/**
 * @author Liu
 * @create 2022-06-30-18:11
 * 定义类Student1，包含三个属性：学号number(int)，年级grade(int)，成绩
 * score(int)。 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * 问题一：打印出3年级(state值为3）的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 * 提示：
 * 1) 生成随机数：Math.random()，返回值类型double;
 * 2) 四舍五入取整：Math.round(double d)，返回值类型long。
 */
/*对象数组*/
public class StudentTest {
    public static void main(String[] args) {
        //创建对象数组
        Student[] students = new Student[20];

        //创建学生对象
        for (int i = 0; i < students.length; i++) {
            //给数组元素赋值（每一个值即一个学生对象
            students[i] = new Student();
            //给number属性赋值
            students[i].number = i + 1;
            //年级
            students[i].grade = (int) (Math.random() * (7 - 1) + 1);
            //成绩
            students[i].score = (int) (Math.random() * (101 - 0));
        }

        System.out.println("3年级(state值为3）的学生信息。");
        for (int i = 0; i < students.length; i++) {
            if (students[i].grade == 3)
                System.out.println(students[i].infoString());
        }

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].score > students[j + 1].score) {
                    //交换Studen对象
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        System.out.println("==================");
        for (Student s : students) {
            System.out.println(s.infoString());
        }

    }
}

class Student {
    int number;
    int grade;
    int score;

    public String infoString() {
        return "学号：" + number +
                ", 年级：" + grade +
                ", 分数：" + score;
    }
}
