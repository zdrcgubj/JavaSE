package Set类;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.junit.Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author Liu
 * @create 2022-10-15-14:46
 * @description:
 */
public class ComparatorTest {
    @Test
    public void test2(){
        Comparator<User> comparator = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge()-o2.getAge();
            }
        };
        TreeSet set = new TreeSet<>(comparator);
        set.add(new User("tom", 12));
        set.add(new User("jack", 14));
        set.add(new User("jacy", 17));
        set.add(new User("jacy", 24));
        set.add(new User("jacy", 2));

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }


    @Test
    public void test1() {
        TreeSet set = new TreeSet<>(new UserComparator());

        set.add(new User("tom", 12));
        set.add(new User("jack", 14));
        set.add(new User("jacy", 17));
        set.add(new User("jacy", 24));
        set.add(new User("jacy", 2));

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

class UserComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return o1.getName().compareTo(o2.getName());
    }
}


