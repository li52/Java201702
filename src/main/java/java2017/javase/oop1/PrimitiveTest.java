package java2017.javase.oop1;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.lang.reflect.Member;
import java.lang.reflect.Method;

/**
 * Created by 李朋 on
 * 2017/3/24 0024 上午 11:28.
 */
public class PrimitiveTest {
    private static void method(boolean b) {
        System.out.println("b:"+b);
        b=false;
        System.out.println("c:"+b);
    }

    public static void main(String[] args) {
        boolean b=true;
        System.out.println("a："+b);
        method(b);
        System.out.println("d："+b);
    }
}
