package Set类;

import org.junit.Test;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author Liu
 * @create 2022-10-15-10:04
 * @description:
 */
public class TreeSetTest {

    @Test
    public void test1() {
        TreeSet set = new TreeSet<>();
        set.add(new User("tom",12));
        set.add(new User("tom",12));
        set.add(new User("jack",14));
        set.add(new User("jacy",17));
        set.add(new User("jacy",24));
        set.add(new User("jacy",2));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        TreeSet set = new TreeSet<>();
        set.add(34);
        set.add(12);
        set.add(45);
        set.add(77);
        set.add(-34);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
            if (it.hasNext()) {
                System.out.print(",");
            }
        }
    }
}
