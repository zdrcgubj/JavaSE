package Set类;

import java.util.Comparator;
import java.util.HashSet;

/**
 * @author Liu
 * @create 2022-10-14-23:36
 * @description:
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("jack");
        set.add("rose");
        set.add("cxk");
        set.add("jack");
        set.add("tom");
        set.add("111");
        System.out.println(set);
    }
}
