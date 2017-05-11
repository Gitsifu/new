package java7;

/**
 * Created by sifu on 2017/4/21.
 */
public class SwitchStringDemo {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        String s3 = "c";
        //java7开始switch支持String
        //java5支持枚举作为switch的参数
        //switch只支持int作为参数类型，为什么？（看反编译文件）
        switch (s2) {
            case "a":
                System.out.println("a");
                break;
            case "b":
                System.out.println("b");
                break;
            case "c":
                System.out.println("c");
                break;
        }
    }
}
