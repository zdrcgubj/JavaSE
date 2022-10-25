package com_2_继承性.com.exer3;

/**
 * @author Liu
 * @create 2022-10-08-16:45
 * @description:
 */
public class Cat {
    String name;
    String type;
    int  age;
    String sex;

    public Cat() {
    }

    public Cat(String name, String type, int age, String sex) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.sex = sex;
    }

    public void show(){
        System.out.println("name:"+name+" type:" +type +" age:"+age+" sex:"+sex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
class test{
    public static void main(String[] args) {
        TomCat tomCat = new TomCat("TOm","tom",12,"aa");
        tomCat.show();
    }
}
