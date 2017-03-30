package java2017.javase.oop1;

/**
 * Created by 李朋 on
 * 2017/3/24 0024 上午 8:47.
 */
public class Scope {
    public void method() {
        int i = 0;
        int j = 1;
        System.out.println(j);
        for (int k = 0; k < 10; k++) {
            j = 2;
            System.out.println(j);
        }
        for (int k = 0; k < 10; k++) {
        }
    }

    private int i;

    public static void main(String[] args) {
        Scope scope = new Scope();
        scope.method();
    }

    public void exceptionTest() {
        try {
            String s = "hello";
        } catch (Exception e) {

        }finally {

        }
    }
}

