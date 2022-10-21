package class23;

public class Replit177 {
    public static void main(String[] args) {
        double firstNumber = 100.00;
        double secondNumber = 20.00;

        Main2 obj= new Main2();
        double result= obj.labelAdding(100,20);
        System.out.println("Result is ::: "+result);
        double result1= obj.labelSubtracting(100,20);
        System.out.println("Result is ::: "+result1);
        double result2= obj.labelMultiply(100,20);
        System.out.println("Result is ::: "+result2);
        double result3= obj.labelDividing(100,20);
        System.out.println("Result is ::: "+result3);

    }

}

interface Outputs {
    void display (double result);
}
interface Functions extends Outputs {
    double labelAdding (double firstNumber, double secondNumber);
    double labelSubtracting (double firstNumber, double secondNumber);
    double labelMultiply (double firstNumber, double secondNumber);
    double labelDividing (double firstNumber, double secondNumber);

}

class Main2 implements Functions {

    @Override
    public void display(double result) {
        System.out.println("Result is ::: "+result);
    }

    @Override
    public double labelAdding(double firstNumber, double secondNumber) {
        return firstNumber+secondNumber;
    }

    @Override
    public double labelSubtracting(double firstNumber, double secondNumber) {
        return firstNumber-secondNumber;
    }

    @Override
    public double labelMultiply(double firstNumber, double secondNumber) {
        return firstNumber*secondNumber;
    }

    @Override
    public double labelDividing(double firstNumber, double secondNumber) {
        return firstNumber/secondNumber;
    }
}
