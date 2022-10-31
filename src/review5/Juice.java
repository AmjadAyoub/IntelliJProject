package review5;

final class Drink{
    void drink(){
        System.out.println("drinking method");
    }

    // final methods cannot be overridden
   protected final void enjoy(){
        System.out.println("we enjoy drinking water");
    }



}



// cannot inherit from a final class
  //public class Juice extends Drink {

    // cannot override the final method
 /*  public  void enjoy() {
       System.out.println("we enjoy drinking juice");

    } */


