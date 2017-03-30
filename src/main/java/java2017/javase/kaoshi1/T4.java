package java2017.javase.kaoshi1;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/18 0018.
 */
public class T4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入摄氏度C");
        double c=scanner.nextDouble();
        double f=(9/5)*c+32;
        System.out.println("华氏温度F");
    }
}
