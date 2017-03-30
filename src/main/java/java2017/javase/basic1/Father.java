package java2017.javase.basic;

/**
 * Created by Administrator on 2017/3/16 0016.
 */
public class Father {
    int money;
    public void coding() {
        System.out.println("father is coding");
    }
}

class Son extends Father {

}

class Extendstest {
    public static void main(String[] args) {
//        java2017.javase.basic.Father father=new java2017.javase.basic.Father();
        //System.out.println(father.money);
        //father.coding();

        Son son=new Son();
        System.out.println(son.money);
        son.coding();

    }

}
