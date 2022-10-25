package List类;

import org.junit.Test;

import java.util.LinkedList;

/**
 * @author Liu
 * @create 2022-10-14-23:00
 * @description:
 */
public class LinkedListDemo {

    @Test
    public void test2(){
        LinkedList list = new LinkedList<>();
        list.offer("123");
        list.offer(111);
        list.offer("abc");
        list.offer("tom");
        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list);

        System.out.println(list.peek());

    }

    @Test
    public void test1(){
        LinkedList list = new LinkedList<>();
        list.push("123");
        list.push(111);
        list.push("abc");
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());

    }
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("jack");
        list.add("tom");
        list.add("jerry");
        list.add("alice");
        System.out.println(list);

        list.addFirst("paul");
        list.addLast("jacy");
//        System.out.println(list);
//        System.out.println("================");
//        System.out.println(list.getFirst());
//        System.out.println(list.getLast());
//
//        System.out.println("================");
//        list.removeFirst();
//        list.removeLast();
//        System.out.println(list);
    }

}
