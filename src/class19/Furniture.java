package class19;

public class Furniture {

    String color="green";

}

class Chair extends Furniture {
    String color="Red";
    void printColor() {
        String color="Black";
       System.out.println(color);   // prints the local variable (black)
        System.out.println(this.color);  // prints the instance variable from same class (Red)
        System.out.println(super.color);  // prints the instance variable from parent class (green)
    }
}

class TestChair {
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();
    }
}
