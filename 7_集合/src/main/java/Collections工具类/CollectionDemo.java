package Collections工具类;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Liu
 * @create 2022-10-16-10:33
 * @description:
 */
public class CollectionDemo {
    @Test
    public void test1() {

        List list = new ArrayList();
        list.add("111");
        list.add("123");
        list.add("44");
        list.add("tom");

        System.out.println(list);
        //reverse(List):反转
        /*Collections.reverse(list);
        System.out.println(list);  //[tom, 44, 123, 111]  */

/*        //shuffle(List)
        Collections.shuffle(list);
        System.out.println(list); //[123, tom, 44, 111]

        //sort
        Collections.sort(list);
        System.out.println(list);*/

        //返回的lis1就是线程安全的
        List list1 = Collections.synchronizedList(list);

    }
}
