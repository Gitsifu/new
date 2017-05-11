package stringutil;

/**
 * Created by sifu on 2017/4/19.
 */
public class StringUtil {
    private StringUtil(){}
    public static void main(String[] args){
        //System.out.println(hasLength("iejf"));
        String str = String.join("-","a","b","c");
        System.out.println(str);
    }
    //判断字符串非空
    //1）引用为空，null.
    //2）空字符串，"".
    public static boolean hasLength(String str){
        return str != null && !"".equals(str.trim());
    }
    //判断是否为空
    public static boolean isBlank(String str){
        return !hasLength(str);
    }
    /*定义一个String join(String lep,String... str)方法用分隔符lep把可变参数分隔出来
    * java 1.8 String类中提供了静态join()方法
    * */
}
