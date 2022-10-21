package review4;

public class Banana extends Fruit {
    String origin;

    Banana(String name, String shape, String color, String origin) {
       super (name,shape,color);
       this.origin=origin;

    }
    void makeSmothie() {
        System.out.println("from "+name+" we get tasty smoothie");
    }


    void makePie() {
        System.out.println("banana pie is delicious");
    }

    // when child class has same method as super class we call it overriding.
    //overriding: methods with same name but in different classes
    //method signature must be the same
    // return type must be the same
    //access modifier must be same or be higher
    protected void grow() {
        System.out.println(name+" grows fast and fresh");
    }

    public static void havePeel() {
        System.out.println("banana is very easy to peel");
    }

    public static void main(String[] args) {
        Banana ban=new Banana("banana","banana shape","yellow","Ecuador");

        ban.haveBenefits();  // from fruit class
        ban.makeSmothie();  // from banana class
        ban.grow(); // from banana class not from fruit because banana is same class has priority

        Banana.havePeel(); // from banana class
        Fruit.havePeel(); // from fruit class

        System.out.println("-----------------");
        // runtime polymorphism

        Fruit fruit=new Banana ("banana", " banana shape", "green","Africa");
        fruit.grow();  // runtime polymorphism achieved thru overriding- executes based on object(banana)
        fruit.haveBenefits();

        fruit.havePeel(); // from fruit class/ because this is not polymorphism because child and parent methods are static


    }

}
