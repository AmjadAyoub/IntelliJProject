package review3;

public class Replit143 {
    public static void main(String[] args) {
        Car car=new Car("Toyota","Prius",4,120,30000.0);
        car.display();
        Car car1=new Car("Toyota","Prius",120,30000.0);
        car1.display();
        Car car3=new Car(4,120,30000.0);
        car3.display();
        Car car4=new Car("Toyota","Prius",4);
        car4.display();

    }

}

class Car {
    String make;
    String model;
    int numberOfDoors;
    int topspeed;
    double price;

    public Car(String make, String model, int numberOfDoors, int topspeed, double price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topspeed = topspeed;
        this.price = price;


    }

    public Car(String make, String model, int topspeed, double price) {
        this.make = make;
        this.model = model;
        this.topspeed = topspeed;
        this.price = price;
        this.numberOfDoors=4;
    }

    public Car(int numberOfDoors, int topspeed, double price) {
        this.numberOfDoors = numberOfDoors;
        this.topspeed = topspeed;
        this.price = price;
        this.make= "unknown";
        this.model= "unknown";
    }

    public Car(String make, String model, int numberOfDoors) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topspeed=90;
        this.price=0;
    }
    void display() {
        System.out.println(make+" "+model+" "+numberOfDoors+" "+topspeed+" "+price);
    }

}
