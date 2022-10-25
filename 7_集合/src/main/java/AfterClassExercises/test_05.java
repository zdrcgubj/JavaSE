package AfterClassExercises;

import java.util.*;

/**
 * @author Liu
 * @create 2022-10-17-17:59
 * @description:
 */
public class test_05 {
    public static void main(String[] args) {
        List<Worker> list = new ArrayList<>();

        list.add(new Worker("zhang3", 18, 3000));
        list.add(new Worker("li4", 25, 3500));
        list.add(new Worker("wang5", 22, 3200));
        System.out.println(list);

        list.add(1, new Worker("zhao6", 24, 3300));
        System.out.println(list);

        Iterator<Worker> iterator = list.iterator();
        while (iterator.hasNext()) {
            Worker next = iterator.next();
            if (next.getName().equals("wang5")) {
                iterator.remove();
            }
        }
        System.out.println(list);

        for (Worker worker : list) {
            worker.work();
        }
    }
}

class Worker {

    private int age;

    private String name;

    private double salary;

    public Worker() {
    }

    public Worker(String name, int age, double salary) {

        this.name = name;

        this.age = age;

        this.salary = salary;

    }

    public int getAge() {

        return age;

    }

    public void setAge(int age) {

        this.age = age;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public double getSalary() {

        return salary;

    }

    public void setSalary(double salary) {

        this.salary = salary;

    }

    public void work() {

        System.out.println(name + "work");

    }

    @Override
    public String toString() {
        return "Worker{" +
                "name=" + name +
                ", age='" + age + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return age == worker.age &&
                Double.compare(worker.salary, salary) == 0 &&
                Objects.equals(name, worker.name);
    }

    @Override
    public int hashCode() {
        int result = 0;

        if (name != null) result = name.hashCode();

        return result + age;
    }
}
