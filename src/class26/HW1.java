package class26;

import java.util.ArrayList;

public class HW1 {
  /*  Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
    Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute.
        Create 3 objects of the sub classes and store them in ArrayList. Using for loop/advanced for loop/ iterator access all methods of the class.*/
  public static void main(String[] args) {

      ArrayList <Insurance> array=new ArrayList<>();
      array.add(new Car("TD","BMW"));
      array.add(new Pet("Travelers","Bird"));
      array.add(new Health("Wawanesa"));

// if we do not use for loop, then we have to do toString method. See God class in class 27 how toString method is done
      for(Insurance insurance: array){

          insurance.cancelInsurance();
          insurance.getQuote();
      }

  }

}
abstract class Insurance {
    String insuranceName;

     Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    abstract void  getQuote();


    abstract void cancelInsurance();




}
class Car extends Insurance {


    String carModel;

     Car(String insuranceName,String carModel) {
        super(insuranceName);  // calls the parent class constructor
        this.carModel=carModel;
    }


    @Override
    void getQuote() {

        System.out.println(insuranceName+" charges 3% of the car value for "+carModel);
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName+" has been cancelled");
    }
}
class Pet extends Insurance{


    String petType;
     Pet(String insuranceName,String petType) {

        super(insuranceName);
        this.petType=petType;
    }

    @Override
    void getQuote() {
        System.out.println(insuranceName+" charges 1500 USD for "+petType);
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName+" has been cancelled for "+petType);

    }
}
class Health extends Insurance{


     Health(String insuranceName) {
        super(insuranceName);

    }

    @Override
    void getQuote() {
        System.out.println(insuranceName+" charges 2000 USD for health");
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName+" has been cancelled");
    }
}
