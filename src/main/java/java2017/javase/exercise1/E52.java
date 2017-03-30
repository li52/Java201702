package java2017.javase.exercise1;

/**
 * Created by Administrator on 2017/3/15 0015.
 */
public class E52 {
    private void hanoi(int n ,String src, String dest){
        if (n == 1) {
            System.out.println(src + "-" + dest);
        } else {
            hanoi(n - 1, src, dest);
            System.out.println(src + "-" + dest);
            hanoi(n - 1, src, dest);

        }

    }

    public static void main(String[] args) {
        E52 e52=new E52();
//        e52.hanoi(20,);
        System.out.println();
    }

}
