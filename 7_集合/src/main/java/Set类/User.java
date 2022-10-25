package Set类;

import lombok.Data;

/**
 * @author Liu
 * @create 2022-10-15-15:26
 * @description:
 */
@Data
class User implements Comparable<User>{
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //按姓名从小到大排序
    @Override
    public int compareTo(User o) {
        //姓名相同比较年龄
        if(this.name.equals(o.name)){
            return Integer.compare(this.age,o.age);
        }else {
            return this.name.compareTo(o.name);//此处compareTo调用的是String的compareTo,非递归调用
        }
    }
}
