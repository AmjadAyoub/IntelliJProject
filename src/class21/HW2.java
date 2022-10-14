package class21;

public class HW2 {
    //Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based
    //on the given balance.
    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.

    public static void main(String[] args) {
        CreditCard obj = new CreditCard();
        obj.Calculation();
        Visa visa =new Visa();
        visa.Calculation();
        AX ax = new AX();
        ax.Calculation();
    }

}

class CreditCard {

    double balance=7500;
    double interest=2.1/100;

    void Calculation() {
        System.out.println("The interest on " + balance + " is " + (balance * interest));
    }

}
class Visa extends CreditCard {

}

class AX extends CreditCard {
    double interest=2.5/100;
    void Calculation() {

        System.out.println("The interest on " + balance + " is " + (balance * interest));
    }
}

