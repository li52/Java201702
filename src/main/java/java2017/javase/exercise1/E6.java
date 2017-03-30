package java2017.javase.exercise1;

/**
 * Created by Administrator on 2017/3/17 0017.
 *///输入两个正整数m和n  求其最大公约数和最小公倍数
public class E6 {
    public static void main(String[] args) {
        int m = 10;
        int n = 15;
        int min = Math.min(m, n);
        for (int i = min; i > 0; i--) {
            if ((m % i == 0 && n % i == 0)) {
                System.out.println(i);
                break;
            }
        }
        int max = Math.max(m, n);
        for (int i = max; i < m * n + 1; i++) ;


    }
}
