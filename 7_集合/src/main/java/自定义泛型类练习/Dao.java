package 自定义泛型类练习;

import java.util.*;

/**
 * @author Liu
 * @create 2022-10-18-22:53
 * @description: 定义个泛型类DAO<T> T>，在其中定义一个 Map 成员变量， Map 的键为 String 类型，值为 T 类型。
 * <p>
 * 分别创建以下方法：
 * public void save(String id,T entity)保存 T 类型的对象到 Map 成员变量中
 * public T get(String id)：从 map 中获取 id 对应的对象
 * public void update(String id,T entity)：替换 map 中 key 为 id 的内容改为 entity 对象
 * public List<T> list()：返回 map 中存放的所有 T 对象
 * public void delete(String id)：删除指定 id 对象
 */
public class Dao<T> {
    private Map<String, T> map;

    public Dao() {
        map = new HashMap<>();
    }

    public Dao(Map<String, T> map) {
        this.map = map;
    }

    //保存 T 类型的对象到 Map 成员变量中
    public void save(String id, T entity) {
        map.put(id, entity);
    }

    //从 map 中获取 id 对应的对象
    public T get(String id) {
        return map.get(id);
    }

    //替换 map 中 key 为 id 的内容改为 entity 对象
    public void update(String id, T entity) {
        if (map.containsKey(id)) {
            map.put(id, entity);
        }
    }

    //返回 map 中存放的所有 T 对象
    public List<T> list() {
        Collection<T> values = map.values();
        ArrayList<T> list = new ArrayList<>();
        list.addAll(values);
        return list;
    }

    //删除指定 id 对象
    public void delete(String id) {
        map.remove(id);
    }
}
