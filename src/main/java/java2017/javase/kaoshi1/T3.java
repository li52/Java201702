package java2017.javase.kaoshi1;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/18 0018.
 */
public class T3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("三角形边长");
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();
        double s=(a+b+c)/2;
        double z=(a+b+c);
        System.out.println("三角形边长"+z);
        System.out.println("三角形面积"+(s=Math.sqrt((s-a)*(s-b)*(s-c))));


    }
}
