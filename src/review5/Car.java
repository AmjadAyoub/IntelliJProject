package review5;

interface Drivable {
    // by default: all variables public static final
    boolean DRIVES=true;

    // we cannot have a constructor
    // by default all methods are public abstract
    void brakes();
}

interface Vehicle {
    void haveMotor();

    // from Java 8 we can have static and default methods

  default void haveBrake() {
        System.out.println("All vehicles have brake");
    }
    static void honk (){
        System.out.println("all vehicles honk");
    }

}

public abstract  class Car {
    String make, model,color;
    public static final int WHEELS=4;  // variable name is all upperclass because it is final
    public Car(String make, String model, String color){
        this.make=make;
        this.model=model;
        this.color=color;

    }
    void drive(){
        System.out.println("All cars can drive");
    }
    abstract void start();

    abstract void stop();
}

 class Tesla extends Car implements Drivable,Vehicle{
    Tesla(String make, String model, String color){
        super(make, model,color);
    }

    public void start(){
        System.out.println(make+" starts automatically");
    }
   public void stop(){
        System.out.println(make+" stops when we press brakes");
    }
    public void charge(){
        System.out.println("You need to charge");
    }
    public void brakes() {
        System.out.println(make+" can brake");
    }
    public void haveMotor() {
        System.out.println(make+" have motor");
    }
}
class Test {
    public static void main(String[] args) {
        Car car=new Tesla ("Tesla","X","Yellow");
        car.drive();
        car.start();
        car.stop();
      //  car.charge();  cannot be accessible because charge method is in Tesla not in Car class

        Tesla tesla =new Tesla ("Tesla","X","Green");
        tesla.drive();
        tesla.start();
        tesla.stop();
        tesla.charge();
        //Car cars=new Car();
        // new Car(); not possible to create an object of car class because it is abstract (incomplete class)


    }
}
