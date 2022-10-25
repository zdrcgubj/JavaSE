package com_1_exer;

/**
 * @author Liu
 * @create 2022-06-30-18:11
 * 定义类Student，包含三个属性：学号number(int)，年级grade(int)，成绩
 * score(int)。 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * 问题一：打印出3年级(state值为3）的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 * 提示：
 * 1) 生成随机数：Math.random()，返回值类型double;
 * 2) 四舍五入取整：Math.round(double d)，返回值类型long。
 */
/*对象数组
*
* 此代码是对StudentTest。java的改进，将操作功能封装到方法中
* */
public class StudentTest1 {
    public static void main(String[] args) {
        Student1 student = new Student1();
        //创建数组
        Student1[] stu = new Student1[20];


        //创建学生对象
        student.createStudent(stu);

        //3年级(state值为3）的学生信息。
        System.out.println("3年级(state值为3）的学生信息。");
        student.searchStudent(stu, 3);

        //排序
        student.sortStudent(stu);

        //遍历
        System.out.println("==================");
        student.printStudednt(stu);
    }
}

class Student1 {
    int number;
    int grade;
    int score;

    public String infoString() {
        return "学号：" + number +
                ", 年级：" + grade +
                ", 分数：" + score;
    }

    //创建学生对象
    public void createStudent(Student1[] students) {
        for (int i = 0; i < students.length; i++) {
            //给数组元素赋值（每一个值即一个学生对象
            students[i] = new Student1();
            //给number属性赋值
            students[i].number = i + 1;
            //年级
            students[i].grade = (int) (Math.random() * (7 - 1) + 1);
            //成绩
            students[i].score = (int) (Math.random() * (101 - 0));
        }
    }

    //遍历Student数组
    
    public void printStudednt(Student1[] students) {
        for (Student1 s : students) {
            System.out.println(s.infoString());
        }
    }

    //查找指定年级的学生信息
    public void searchStudent(Student1[] students, int grade) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].grade == grade)
                System.out.println(students[i].infoString());
        }
    }

    //根据指定信息排序
    public void sortStudent(Student1[] students) {
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].score > students[j + 1].score) {
                    //交换Studen对象
                    Student1 temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}

