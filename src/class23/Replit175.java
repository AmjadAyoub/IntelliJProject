package class23;

public class Replit175 implements FirstInterface,SecondInterface {


    @Override
    public void firstMethod() {
        System.out.println("First Method implementing multiple Inheritance");
    }

    @Override
    public void secondMethod() {
        System.out.println("Second Method implementing multiple Inheritance");
    }


    public static void main(String[] args) {
        Replit175 obj = new Replit175();
        obj.firstMethod();
        obj.secondMethod();

    }
}

interface FirstInterface {
    void firstMethod();


}
interface SecondInterface {
    void secondMethod();

}
