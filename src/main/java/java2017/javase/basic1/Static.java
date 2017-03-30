package java2017.javase.basic1;

/**
 * Created by Administrator on 2017/3/17 0017.
 */
public class Static {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();

        System.out.println(calculatorTest.add(2.1, 3.1));//输出位置  引用return
        System.out.println(calculatorTest.add(1d, 2));
    }
}
class CalculatorTest {
    public double add(double x, double y) {
        return x + y;
    }

    public int add(int x, int y) {
        return x + y;
    }

    public double add(int x, double y) {
        return x + y;
    }

    public double add(double x, int y) {
        return x + y;
    }

}

