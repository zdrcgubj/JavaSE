package Set类.exer1;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Liu
 * @create 2022-10-15-16:44
 * @description:在list中去除重复数字值,要求尽量简单
 */
public class SetExer1 {
    public static List duplicateNum(List list) {
        HashSet set = new HashSet<>(list);
        //set.addAll(list);
        return new ArrayList(set);
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(2));
        list.add(new Integer(4));
        list.add(new Integer(4));
        System.out.println(list);
        list = duplicateNum(list);
        System.out.println(list);
    }
}
