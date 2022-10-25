import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Liu
 * @create 2022-10-13-15:09
 * @description:
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(123);
        c.add(456);
        c.add(new String("Tom"));
        Person p = new Person();
        c.add(p);
        c.add(false);

        //contains(Object,obj):判断当前集合中是否包含obj
        System.out.println(c.contains(123));  //true
        System.out.println(c.contains(new String("Tom")));//true
        System.out.println(c.contains(new Person()));   //false
        System.out.println(c.contains(p));  //true

        //containsAll(Collection c) 判断col中所有元素是否都在当前集合中
        Collection col = Arrays.asList(123, 111);
        System.out.println(c.containsAll(col));

        //removeAll(Collection coll1) :从当前集合移除coll1中所有元素(差集)
        System.out.println(c);
        Collection coll1 = Arrays.asList(123, 4567);
        c.removeAll(coll1);
        System.out.println(c); //[456, Tom, Person@1540e19d, false]

        //retainAll  交集
        c.retainAll(coll1);
        System.out.println(c); //[123]

    }
}

class Person {

}

