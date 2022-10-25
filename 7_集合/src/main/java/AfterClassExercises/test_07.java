package AfterClassExercises;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Liu
 * @create 2022-10-17-20:05
 * @description:
 */
class Worker2{

    String name;

    int age;

    double salary;

    public Worker2(){}

    public Worker2(String name, int age, double salary){

        this.name = name;

        this.age = age;

        this.salary = salary;

    }

    public int hashCode(){

        return (int) (name.hashCode() + age + salary);

    }

    public boolean equals(Worker2 w){

        if (w.name == name && w.salary == salary && w.age == age){

            return true;

        }else{

            return false;
        }

    }

}

public class test_07 {

    public static void main(String args[]){

        Set<Worker> set = new HashSet<Worker>();

        set.add(new Worker("tom", 18, 2000));

        set.add(new Worker("tom", 18, 2000));

        set.add(new Worker("jerry", 18, 2000));
        System.out.println(set);

        System.out.println(set.size());

    }

}
