package java5.foreach;

import java.util.HashSet;

/**
 * Created by sifu on 2017/4/19.
 */
public class ForeachDemo {
    public static void main(String[] args) {
        //doArray();
        doCollection();
    }

    //数组
    public static void doArray() {
        String[] str = {"a", "b", "c", "d"};
        for (String a : str) {
            System.out.println(a);
        }
    }

    //集合（实现了Iterator接口的类及子类）
    public static void doCollection() {
        HashSet set = new HashSet();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        for (Object a : set) {
            System.out.println(a);
        }
    }
}
