package java5.enum_demo;

/**
 * Created by sifu on 2017/4/21.
 */
public class WeekDay {
    public static final Integer MONDAY = 1;
    public static final Integer TUESDAY = 2;
    public static final Integer WEDNESDAY = 3;
    public static final Integer THURSDAY = 4;
    public static final Integer FRIDAY = 5;
    public static final Integer SATURDAY = 6;
    public static final Integer SUNDAY = 7;
    //防止调用者创建新的WeekDay对象
    private WeekDay(){}
}
