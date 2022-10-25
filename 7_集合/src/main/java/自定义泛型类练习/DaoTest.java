package 自定义泛型类练习;

import java.util.List;

/**
 * @author Liu
 * @create 2022-10-18-23:13
 * @description:
 */
public class DaoTest {
    public static void main(String[] args) {
        Dao<User> dao = new Dao<>();

        //保存
        dao.save("1001", new User(1001, "jerry", 14));
        dao.save("1002", new User(1001, "Tom", 16));
        dao.save("1003", new User(1003, "Tom1", 118));

        //查询
        List<User> list = dao.list();
        System.out.println(list);

        //更新
        dao.update("1002", new User(1002, "Tom", 17));
        System.out.println(dao.list());

        //删除
        dao.delete("1003");
        System.out.println(dao.list());

        //取值
        User user = dao.get("1002");
        System.out.println(user);


    }

}
