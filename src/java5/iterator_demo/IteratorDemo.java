package java5.iterator_demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by sifu on 2017/4/21.
 */
public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for(Iterator it = list.iterator();it.hasNext();){
            System.out.println(it.next());
        }
    }
}
