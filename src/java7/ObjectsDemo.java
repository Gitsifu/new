package java7;

import java.util.Date;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by sifu on 2017/4/21.
 */

public class ObjectsDemo {
    public static void main(String[] args) {

        Date d = new Date();
        System.out.println(d.toString());
        //Objects类是对象的工具类
        System.out.println(Objects.toString(d));

        Random r = new Random();
        //获取100以内的随机数
        System.out.println(r.nextInt(100));

        //获取一个ThreadLocalRandom对象
        ThreadLocalRandom tlr = ThreadLocalRandom.current();
        System.out.println(tlr.nextInt(100, 200));//获取100-200的随机数
    }
}
