package java2017.javase.exercise1;

import java2017.javase.basic1.Static;

/**
 * Created by 李朋 on
 * 2017/3/25 0025 上午 9:30.
 */
public class K1 {
    public static void main(String[] args) {
        Animal
        animal = new Flying();
        animal.name="鸟";
        animal.shout();

        animal=new Dog();
        animal.name="狗";
        animal.shout();

        animal= new Sheep();
        animal.name="鸡";
        animal.shout();
    }
}
abstract class Animal {
    protected String name;
    protected abstract void shout();
}

class Flying extends Animal {
    protected void shout() {
        System.out.println(name+"：唧唧~~");
    }
}
class Dog extends Animal {
    protected void shout() {
        System.out.println(name+"：旺旺~~");
    }
}

class Sheep extends Animal {
    protected void shout() {
        System.out.println(name+"：咕咕~~");
    }
}