package java2017.javase.exercise1;

/**
 * Created by 李朋 on
 * 2017/3/21 0021 下午 2:49.
 */
//输入9*9的乘法表
public class E16 {
   /* public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int k = 1; k <= 9 - i; k++) {
                System.out.println();
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }

    }*/
 public static void main(String[] args) {
        for (int i=0;i<9;i++) {
            for (int j=0;j<9;j++) {
                if (i >= j) {
                    System.out.print((i+1) + "*" + (j+1) + "=" + (i+1) * (j+1) + "\t");
                }
            }
            System.out.println();
        }
    }
}
