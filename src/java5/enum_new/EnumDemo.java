package java5.enum_new;

/**
 * Created by sifu on 2017/4/21.
 */
public class EnumDemo {
    public static void main(String[] args){
        WeekDay wd = WeekDay.valueOf("MONDAY");//将MONDAY字符串转化成WeekDay对象
        System.out.println(wd.ordinal());//将对象的序列数输出
        WeekDay[] weekDays = WeekDay.values();//获取枚举类中所有的对象
    }
}
