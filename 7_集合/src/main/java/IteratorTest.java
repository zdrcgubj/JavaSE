import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Liu
 * @create 2022-10-13-20:32
 * @description:
 */
public class IteratorTest {
    public static void main(String[] args) {
//        //迭代器的作用：获取集合中的所有的元素
//        Collection coll = new ArrayList();
//        coll.add("jack");
//        coll.add("rose");
//        coll.add(10);
//        coll.add(20.2);
//        //1、获取迭代器对象
//        Iterator it = coll.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
//        System.out.println(coll);

        Collection coll = new ArrayList();
        coll.add("jack");
        coll.add("rose");
        coll.add(10);
        coll.add(20.2);
        coll.add(100);
        Iterator it = coll.iterator();
        while(it.hasNext()) {
            //coll.add("zhaosi");
            System.out.println(it.next());
            it.remove();
            it.remove();
        }
        System.out.println(coll);
    }
}
