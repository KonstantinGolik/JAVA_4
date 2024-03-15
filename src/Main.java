import gb_collections.GbList;
import gb_collections.lists.GbArrayList;
import gb_collections.lists.GbLinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        GbList<Integer> list = new GbArrayList<>();
//        list.add(5);
//        list.add(54);
//        list.add(79);
//        list.add(-3);
//        list.add(2);
//        list.add(-34);
//        System.out.println(list.size());
//        System.out.println(list);
//        list.removeByIndex(1);
//        list.remove(79);
//        System.out.println(list);
        GbList<Integer> list = new GbLinkedList<>();
        System.out.println(list.size());
        System.out.println(list);
        list.add(4543);
        list.add(456);
        list.add(6);
        System.out.println(list);
        System.out.println(list.size());
//        list.removeByIndex(2);
//        System.out.println(list);
//        System.out.println(list.size());
//        list.removeByIndex(1);
//        System.out.println(list);
//        System.out.println(list.size());
//        list.removeByIndex(0);
//        System.out.println(list);
//        System.out.println(list.size());
//        LinkedList
        list.remove(4543);
        System.out.println(list);
        System.out.println(list.size());
        list.remove(456);
        System.out.println(list);
        System.out.println(list.size());
        list.remove(6);
        System.out.println(list);
        System.out.println(list.size());
    }
}