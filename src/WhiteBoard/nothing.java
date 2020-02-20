package WhiteBoard;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

/**
 * @auther: wilson
 * @version: v1.0 创建时间: 2019-12-26:2019
 * Des:
 */
public class nothing {
    public static void main(String[] args) {
//        System.out.println(B.hello);
        String s1 = new String("q") + new String("q");
        s1.intern();
        String s2 = "qq";
        System.out.println(s1 == s2);

    }
}

class A{
    public  static  String hello = "wangsen";

    static {
        System.out.println("this is A static");
    }


}

class B extends  A{
    static {
        System.out.println("this is B static");
    }

}
