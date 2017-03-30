package java2017.javase.exercise1;

import java.util.Scanner;

/**
     * Created by Administrator on 2017/3/14 0014.
      */
     public class E3 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int b = i / 1000;
            int bai = i / 100 % 10;
            int shi = i / 10 % 10;
            int ge = i % 10;
            if (i == b * b * b * b + bai * bai * bai * bai + shi * shi * shi * shi + ge * ge * ge * ge)
                System.out.println(i);
        }
    }
}
