package java7;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sifu on 2017/4/21.
 */
public class SafeVarargsDemo {
    public static void main(String[] args){
        //堆污染
        List<Integer> list1 = new ArrayList<>();//java7菱形语法
        list1.add(1);
        list1.add(2);
        list1.add(3);
        List list2 = list1;
        List<String> list3 = list2;
        System.out.println(list3.get(1));
    }
}
