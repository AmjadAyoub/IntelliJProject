package class21;

public class HW2AsgharWay {
    /*
    Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.
     */
}

class CreditCard1{
    double balance;
    double interest;
    CreditCard1(double balance,double interest){
        this.balance=balance;
        this.interest=interest;
    }

    void calculateInterest(){

        double interestAmount=interest*balance/100;
        System.out.println("Interest Amount "+interestAmount);
    }

}
class Visa1 extends CreditCard1{

    Visa1(double balance,double interest){
        super(balance, interest);
    }


    void calculateInterest() {
        double interestAmount=interest*balance/100;
        System.out.println();
        System.out.println("interest Amount "+interestAmount+5);
        System.out.println("interest Amount "+(interestAmount+5));
    }
}

class AX1 extends CreditCard1{

    AX1(double balance,double interest){
        super(balance, interest);
    }


    void calculateInterest() {
        double interestAmount=interest*balance/100;
        System.out.println();
        System.out.println("Interest Amount "+interestAmount+10);
    }

}
class CreditCardTester {
    public static void main(String[] args) {
        Visa1 visa = new Visa1(100,5);
        visa.calculateInterest();

    }
}
