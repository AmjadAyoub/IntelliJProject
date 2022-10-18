package review3;

public class Replit158 {
    public static void main(String[] args) {
        Child3 obj = new Child3("Fairfax");
        obj.display();

    }


}

class Parent3{
    String city;

    public Parent3(String city) {
        this.city = city;
    }
    public void display(){
        System.out.println("City name " + city);
    }
}

  class Child3 extends Parent3 {
    Child3 (String city) {
       super(city);
    }

}
