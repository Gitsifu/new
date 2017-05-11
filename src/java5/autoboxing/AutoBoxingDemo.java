package java5.autoboxing;

/**
 * Created by sifu on 2017/4/21.
 */
public class AutoBoxingDemo {
    public static void main(String[] args){
        Integer num1 = 19;
        Integer num2 = 19;
        System.out.println(num1 == num2);//true

        Integer num11 = 128;
        Integer num22 = 128;
        System.out.println(num11 == num22);//false

        Integer num3 = new Integer(19);
        Integer num4 = new Integer(19);
        System.out.println(num3 == num4);//false

        Integer num5 = Integer.valueOf(19);
        Integer num6 = Integer.valueOf(19);
        System.out.println(num5 == num6);//true

        Integer num7 = Integer.valueOf(128);
        Integer num8 = Integer.valueOf(128);
        System.out.println(num7 == num8);//false


    }
}
