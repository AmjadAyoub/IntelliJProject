package review3;

public class Replit153 {
    Replit153() {
        System.out.println("This is Parent constructor");
    }
}

class Child1 extends Replit153 {
    Child1() {
        super();
    }
}

class Main1 {
    public static void main(String[] args) {


       Child1 child1 = new Child1();

    }
}