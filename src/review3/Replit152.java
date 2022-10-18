package review3;

public class Replit152 {
    String city;

     Replit152(String city) {
        this.city = city;
    }
    void print() {
        System.out.println(city);
    }
    Replit152() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Replit152 {
    Child (String city) {
        super(city);
    }

}

class Main {
    public static void main(String[] args) {
        Child child = new Child("Vienna");
        child.print();

    }
}
