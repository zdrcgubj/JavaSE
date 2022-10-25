package 图书管理系统.Service.Impl;

import 图书管理系统.Service.UserService;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Liu
 * @create 2022-10-19-10:22
 * @description:
 */
public class UserServiceImpl implements UserService {
    public static void main(String[] args) {


        int[] ints = new int[]{1, 2, 3, 4, 5};
        int[] ints1 = Arrays.copyOfRange(ints, 1, ints.length);
        System.out.println(Arrays.toString(ints1));
        int temp = ints[0];
        ints = Arrays.copyOfRange(ints, 1, ints.length);
        ints[ints.length-1]=temp;
        System.out.println(Arrays.toString(ints));


    }


}
