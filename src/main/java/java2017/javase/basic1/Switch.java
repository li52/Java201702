package java2017.javase.basic1;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/10 0010.
 */
public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input A B C D:");
        String s = scanner.nextLine();
        System.out.println(s);
        char i = 0;
        switch (s) {
            case "A":
                System.out.println("0-60");
                break;
            case "B":
                System.out.println("0-80");
                break;
            case "C":
                System.out.println("80-90");
                break;
            case "D":
                System.out.println("90-100");
                break;
            default:
                System.out.println("default....");
                break;
        }
    }
}


