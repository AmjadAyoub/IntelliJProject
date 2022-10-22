package project;

public class Task3 {
    /* Create a Class Car that would have the
following fields: carPrice and color and method
calculateSalePrice() which should be returning
a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck
class has a field as weight and has its own
implementation of calculateSalePrice() method
in which returned price is calculated as
following: if weight>2000 then returned price
car should include 10% discount, otherwise 20%
discount.
The Sedan class has field as length and also
does it is own implementation of
calculateSalePrice(): if length of sedan is >20
feet then returned car price should include 5%
discount, otherwise 10% discount*/

    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        System.out.println("The price of the sedan after discount is "+"$"+sedan.calculateSalePrice(30000));

        Truck truck = new Truck();
        System.out.println("The price of the truck after discount is "+"$"+truck.calculateSalePrice(50000));


    }


}
class Car {

    double carPrice;
    String color;

    double calculateSalePrice(double carPrice) {
        return carPrice;
    }
}
class Sedan extends Car {
    double length=21;
    double calculateSalePrice(double sedanPrice) {
        if (length > 20) {
            return sedanPrice * 0.95;
        } else {
            return sedanPrice * 0.9;
        }
    }

}



class Truck extends Car {
    double weight=2200;


    double calculateSalePrice(double truckPrice) {
        if (weight> 2000) {
            return truckPrice*0.9;
        } else {
            return truckPrice*0.8;
        }
    }
}