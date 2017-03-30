package java2017.javase.exercise1;

/**
 * Created by Administrator on 2017/3/14 0014.
 */
public class E51 {
    public int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        else {
            return fibonacci(n-2)+fibonacci(n-1);
        }
    }
    public void method() {
        System.out.println("method");
        return;
    }

    public static void main(String[] args) {
        E51 e51=new E51();
        //e51.fibonacci(9)
        //System.out.println(e51.fibonacci(9));
        System.out.println(e51.fibonacci(9));
    }
}
