package AfterClassExercises;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Liu
 * @create 2022-10-17-20:52
 * @description:
 */
public class test_11 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Tom","CoreJava");
        map.put("John","Oracle");
        map.put("Susan","Oracle");
        map.put("Jerry","JDBC");
        map.put("Jim","Unix");
        map.put("Kevin","JSP");
        map.put("Lucy","JSP");
        System.out.println(map);
        map.put("Allen","JDBC");
        map.put("Lucy","CoreJava");
        System.out.println(map);
        map.put("Jack","JSP");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String, String> next = iterator.next();
//            System.out.println(next.getKey()+"==>"+next.getValue());
//        }

        System.out.print("教授JSP的老师有:");
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            if("JSP".equals(next.getValue())){
                System.out.print(next.getKey()+"\t");
            }
        }





    }
}
