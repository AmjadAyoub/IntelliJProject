package review4;

public class Apple extends Fruit {
String size;
String taste;
double price;
    Apple(String name, String shape, String color, String size) {
        super(name,shape,color);
        this.size=size;

    }
    //cannot create a constructor in child class here because it is not initialized in the parent class (fruit)
      /*  Apple(String size) {
        this.size=size;
    }*/
    Apple(String name, String shape, String color, String size,String taste, double price) {
        this(name, shape, color, size);
        this.taste=taste;
        this.price=price;
    }
    // overloading- methods with same name within same class but different parameters
    // in overloading : signature must be different (name & parameters)
    // we do not care about return type
    void makeJuice() {
        System.out.println("from "+name+" we can make "+taste+" juice");
    }

    void makeJuice(String fruit) {
        System.out.println("We can have juice from "+name+" mixed with "+fruit);
    }

    /* this is not overloading -> because signature is same
    String makeJuice() {

    }
    */


    public static void main(String[] args) {
        Apple app=new Apple("apple", "circle", "red","big");
       // app.color;  ERROR (cannot be accessed because color has private modifier) it can be initialized but not called
        System.out.println(app.name);
        System.out.println(app.shape);

        System.out.println(Fruit.fresh); // can be called from the parent
        System.out.println(Apple.fresh);// can be called from the same class because it is static

        app.grow();  // comes from fruit class
        app.haveBenefits();  // comes from fruit class
        app.makeJuice();  // comes from apple class


    }


}
