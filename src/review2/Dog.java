package review2;

public class Dog {
    String name;  // instance var
    int weight;   // instance var
    static String breed;  // static ( the breed is same in all objects because it is static)

    void printInfo() {
        System.out.println("Dog features:"+name+", "+weight+", "+breed);
    }

    void love(String thing) {        // String thing is called parameter
        System.out.println(name+" loves "+thing);
    }

    // create a method to calculate price
    // if weight is less than 5 -> 100
    // if weight is less than 10 -> 300
    // if weight is more than 20 -> 1000

    double getPrice() {
        if(weight<5) {
            return 100;
        } else if (weight<10) {
           return 300;
        } else {
            return 1000;
        }
    }

    //create a method that will return bark type
    // if weight is less than 5 --> loud
    // if weight less than 10 -->noise is wooh
    // if weight is less than 500 --> noise Gav gav

    String bark () {
        String noise;   // noise is a local var because it is inside the block of code
        if (weight <5) {
            noise="loud";
        } else if (weight<10 ) {
            noise="woof woof";
        } else {
            noise="GAV GAV";
        }
        return noise;
    }


}
class Shelter {
    public static void main(String[] args) {
        Dog.breed="Husky";
        Dog dog1=new Dog();
        // how to access instance var
        dog1.name="Bobby";
        dog1.weight=5;
        dog1.printInfo();  // Dog features:Bobby, 5, Husky

        Dog dog2=new Dog();
        System.out.println(dog2.name);  // Null
        dog2.name="Tommy";
        dog2.weight=10;
        dog2.printInfo();  // Dog features:Tommy, 10, Husky
        System.out.println(dog2.name); // Tommy

        System.out.println("MAKING CHANGES");

        dog1.name="Bobik";
        dog1.breed="german";

        dog1.printInfo();  // Dog features:Bobik, 5, german
        dog2.printInfo();  // Dog features:Tommy, 10, german

        double price=dog1.getPrice();
        System.out.println(price);  // 300.0

        double price2=dog2.getPrice();
        System.out.println(price2);  // 1000.0

        System.out.println(dog1.bark());  // woof woof
        System.out.println(dog2.bark());  // GAV GAV

        dog1.love("to jump");  // to jump is called argument
        dog2.love("to play");  // to play is called argument




    }


}

