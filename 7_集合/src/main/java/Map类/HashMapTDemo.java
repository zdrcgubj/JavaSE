package Map类;

import org.junit.Test;

import java.util.*;

/**
 * @author Liu
 * @create 2022-10-15-23:52
 * @description:
 */
public class HashMapTDemo {


    @Test
    public void test3() {
        HashMap<String, String> map = new HashMap();
        map.put("AA", "123");
        map.put("tom", "145");
        map.put("jack", "784");
        map.put("jerry", "784");

        // keySet:返回map集合中所有的key
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
            if (it.hasNext()) {
                System.out.print(",");
            }
        }
        System.out.println();

        //values():返回map集合中所有的value
        Collection<String> values = map.values();
        Iterator<String> it2 = values.iterator();
        while (it2.hasNext()) {
            System.out.print(it2.next());
            if (it2.hasNext()) {
                System.out.print(",");
            }
        }

        //entrySet()
        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        //1.foreach遍历
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        System.out.println("====================");
        //2.Iterator遍历
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry entry = iterator.next();
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        System.out.println("====================");
        //3.通过key获取value
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key+"="+map.get(key));
        }
    }


    @Test//元素查询
    public void test2() {
        HashMap<String, String> map = new HashMap();
        map.put("AA", "123");
        map.put("tom", "145");
        map.put("jack", "784");
        map.put("jerry", "784");
        //get
        System.out.println(map.get("tom"));

        //containsKey
        System.out.println(map.containsKey("tom"));

        //containsValue
        System.out.println(map.containsValue("784"));

        //isEmpty
        map.isEmpty();
    }


    @Test
    public void test1() {
        HashMap<String, String> map = new HashMap();
        //添加
        map.put("AA", "123");
        map.put("Ab", "1213");
        map.put("AA", "123");
        System.out.println(map);
        //修改
        map.put("AA", "1111");
        System.out.println(map);

        //addAll
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("tom", "145");
        map1.put("jack", "784");
        map.putAll(map1);

        System.out.println(map);
        System.out.println("=========================");

        //移除
        String aa = map.remove("AA");
        System.out.println(aa);
        System.out.println(map);

        //清空
        map.clear();
        System.out.println(map);
    }
}
