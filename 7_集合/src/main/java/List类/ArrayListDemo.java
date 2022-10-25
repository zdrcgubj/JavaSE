package List类;

import org.junit.Test;

import java.util.*;

/**
 * @author Liu
 * @create 2022-10-13-23:20
 * @description:
 */
public class ArrayListDemo {

    @Test
    public void test3() {
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("464");
        list.add("aa");

        Iterator it = list.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (String s : list) {
            System.out.println(s);
        }
    }


    @Test
    public void test2() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(456);
        //int indexOf(Object obj):返回obj在集合中首次出现的位置。如果不存在，返回-1.
        int index = list.indexOf(4567);
        System.out.println(index);

        //int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置。如果不存在，返回-1.
        System.out.println(list.lastIndexOf(456));

        //Object remove(int index):移除指定index位置的元素，并返回此元素
        Object obj = list.remove(0);
        System.out.println(obj);
        System.out.println(list);

        //Object set(int index, Object ele):设置指定index位置的元素为ele
        list.set(1, "CC");
        System.out.println(list);

        //List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的左闭右开区间的子集合
        List subList = list.subList(2, 3);
        System.out.println(subList);
        System.out.println(list);
    }

    @Test
    public void test1() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(456);

        System.out.println(list);

        //void add(int index, Object element):在index位置插入element元素
        list.add(1, "BB");
        System.out.println(list);

        //boolean addAll(int index, Collection element):从index位置开始将element中的所有元素添加进来
        List list1 = Arrays.asList(1, 2, 3);
        list.addAll(list1);
//        list.add(list1);
        System.out.println(list.size());//9

        //Object get(int index):获取指定index位置的元素
        System.out.println(list.get(0));
    }
}

