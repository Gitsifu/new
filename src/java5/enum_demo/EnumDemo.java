package java5.enum_demo;

/**
 * Created by sifu on 2017/4/21.
 */
public class EnumDemo {
    public static void main(String[] args){
        doWork();
    }
    public static void doWork(){
        Enployee e = new Enployee();
        e.setRestDay(6);
        if(e.getRestDay() == WeekDay.SATURDAY || e.getRestDay() == WeekDay.SUNDAY){
            System.out.println("周末休息");
        }else{
            System.out.println("周一到周五工作");
        }
    }
}

