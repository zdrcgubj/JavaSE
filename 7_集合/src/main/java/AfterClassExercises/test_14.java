package AfterClassExercises;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Liu
 * @create 2022-10-17-23:00
 * @description:
 */
public class test_14 {
    public static void main(String[] args) {

        String str = "sddajkkwwooppppp";
        HashMap<Character, Integer> map = new HashMap<>();
        Map kv = null;
        for (int i = 0; i < str.length(); i++) {
            kv = getKV(map, str.charAt(i));
        }
        System.out.println(kv);
        pringC(kv);
    }

    public static void pringC(Map map) {
        Set<Character> set = map.keySet();
        System.out.print("该字符串由:");
        for (Character c : set) {
            System.out.print(map.get(c) + "个" + c + "  ");
        }
        System.out.print("构成");
    }

    public static Map getKV(HashMap<Character, Integer> map, char c) {
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();

//        if (!map.containsKey(c)) {
//            map.put(c, 1);
//        } else {
//            int value = map.get(c);
//            value++;
//            map.put(c, value);
//        }
        map.merge(c, 1, (oldValue, newValue) -> oldValue + newValue);
        return map;
    }
}
