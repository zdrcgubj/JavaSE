package Map类;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Liu
 * @create 2022-10-16-9:16
 * @description:
 */
public class TreeMapDemo {

    //定制排序
    @Test
    public void test2() {
        TreeMap<User, Integer> map = new TreeMap(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if (o1.getName().equals(o2.getName())) {
                    //名字相同按年龄降序
                    return o2.getAge() - o1.getAge();
                } else {
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });
        User u1 = new User("tom", 23);
        User u2 = new User("jerry", 22);
        User u3 = new User("alice", 20);
        User u4 = new User("jerry", 19);
        User u5 = new User("jack", 24);

        map.put(u1, 98);
        map.put(u2, 89);
        map.put(u3, 99);
        map.put(u4, 101);
        map.put(u5, 106);


        Set<User> set = map.keySet();
        Iterator<User> iterator = set.iterator();
        while (iterator.hasNext()){
            User key = iterator.next();
            System.out.println(key+"---->"+map.get(key));
        }
    }


    //自然排序
    @Test
    public void test1() {
        TreeMap<User, Integer> map = new TreeMap();
        User u1 = new User("tom", 23);
        User u2 = new User("jerry", 22);
        User u3 = new User("alice", 20);
        User u4 = new User("jerry", 19);
        User u5 = new User("jack", 24);

        map.put(u1, 98);
        map.put(u2, 89);
        map.put(u3, 99);
        map.put(u4, 101);
        map.put(u5, 106);

        Set<User> set = map.keySet();
        for (User o : set) {
            System.out.println(o + "=" + map.get(o));
        }
    }
}
