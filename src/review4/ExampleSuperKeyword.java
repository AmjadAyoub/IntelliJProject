package review4;

public class ExampleSuperKeyword {
    public static void main(String[] args) {
        Chair obj=new Chair();

    }
}

class Furniture {
    Furniture () {
        System.out.println("Furniture class Constructor");
    }
}

class Chair extends Furniture {
    Chair() {
        super(); // calling constructor from parent class (Furniture)
        System.out.println("Chair class Constructor");
    }
}
