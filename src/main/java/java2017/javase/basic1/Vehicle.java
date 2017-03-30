package java2017.javase.basic1;

/**
 * Created by Administrator on 2017/3/16 0016.
 */
public class Vehicle {
    String nome;
    double weight;
    double price;
    char color;

    public void start() {//起点
        System.out.println("java2017.javase.basic.Vehicle is starting.....");
    }
    public void stop() {//终止
        System.out.println("java2017.javase.basic.Vehicle is starting");
    }
}

class Bicycle extends Vehicle {
    String type;//山地车 公共车    类型  type
    double weight;
    public void main() {
        System.out.println("200kg");
    }

}

class Ship extends Bicycle{
    double price;
    public void main() {
        System.out.println("50000$");
    }


}

class Plane extends Ship{
    char color;
    public void main() {
        System.out.println("white");
    }

}

class VehicleTest{
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();


        Bicycle bicycle=new Bicycle();
        System.out.println(bicycle.weight);
        System.out.println();
        bicycle.start();
        bicycle.main();

        Ship ship=new Ship();
        System.out.println(ship.price);
        ship.start();
        ship.main();

        Plane plane=new Plane();
        System.out.println(plane.color);
        plane.stop();
        plane.main();
    }

}
