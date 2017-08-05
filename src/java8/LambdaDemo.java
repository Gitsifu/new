package java8;

/**
 * Created by sifu on 2017/8/5
 *
 * @author sifu
 * @version 1.0.0
 */
public class LambdaDemo {
    public static void main(String[] args) {
        sleep(() -> System.out.printf("睡觉"));
    }

    public static void sleep(ILambda iLambda){
        iLambda.doWork();
    }
}
