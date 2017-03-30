package java2017.javase.oop1;

/**
 * Created by 李朋 on
 * 2017/3/22 0022 上午 8:53.
 */
public class Static {
    public static void main(String[] args) {
        Mankind tom=new Mankind();
        tom.name="tom";
        tom.age=18;
        tom.married=true;
        System.out.println(tom.name);
        System.out.println(tom.age);
        System.out.println(tom.married);

        System.out.println("-----------------------------------------");

        Mankind jerry = new Mankind();
        jerry.age = 16;
        jerry.name = "jerry";
        jerry.married = true;

        System.out.println(jerry.age);
        System.out.println(jerry.name);
        System.out.println(jerry.married);

    }


}

class Mankind {
    public static String name;
    public int age;
    public boolean married;

}
