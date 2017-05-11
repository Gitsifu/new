package java5.somevar;

/**
 * Created by sifu on 2017/4/19.
 */
public class SomeVar {
    public static void main(String[] args) {
        doWork(3, "a", "b", "c");
    }
    /*可变参数只能写在最后，并且只能有一个可变参数
    * 可变参数实际上知识语法糖，底层是一个数组（看反编译代码）
    * */
    public static void doWork(int num, String... str) {
        for (String a : str) {
            System.out.println(a);
        }
    }
}
