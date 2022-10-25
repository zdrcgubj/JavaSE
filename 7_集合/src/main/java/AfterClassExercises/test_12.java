package AfterClassExercises;

/**
 * @author Liu
 * @create 2022-10-17-21:04
 * @description:
 */
import java.util.*;

class Student {

    int age;

    String name;

    public Student(){}

    public Student(String name, int age){

        this.name = name;

        this.age = age;

    }

    public int hashCode(){

        return name.hashCode() + age;

    }

    public boolean equals(Object o){

        if (o == null) return false;

        if (o == this) return true;

        if (o.getClass() != this.getClass()) return false;

        Student stu = (Student) o;

        if (stu.name.equals(name) && stu.age == age) return true;

        else return false;

    }

}

public class test_12 {

    public static void main(String args[]){

        Set<Student> set = new HashSet<Student>();

        Student stu1 = new Student();

        Student stu2 = new Student("Tom", 18);

        Student stu3 = new Student("Tom", 18);

        set.add(stu1);

        set.add(stu2);

        set.add(stu3);

        System.out.println(set.size());

    }

}
