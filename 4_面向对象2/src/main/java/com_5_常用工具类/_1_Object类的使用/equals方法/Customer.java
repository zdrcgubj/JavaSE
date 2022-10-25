package com_5_常用工具类._1_Object类的使用.equals方法;

/**
 * @author Liu
 * @create 2022-10-04-23:57
 * @description:
 */
public class Customer {
    private String name;
    private int age;

    public Customer() {
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof Customer) {
            Customer anotherCus = (Customer) obj;
            //比较两个对象的每个属性是都相同
//            if(this.name.equals(anotherCus.name)&&this.age==anotherCus.age){
//                return true;
//            }else {
//                return false;
//            }
            return this.name.equals(anotherCus.name) && this.age == anotherCus.age;
        }
        return false;
    }
}
