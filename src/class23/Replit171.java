package class23;

public class Replit171 {
    public static void main(String[] args) {
        Main obj = new Main();
        obj.m1();
        obj.m1("word");

    }


}
abstract class Kassem {

    abstract void m1();
    abstract void m1(String word);

}
class Main extends Kassem {


    @Override
    void m1() {
        System.out.println("m1 without parameters");
    }

    @Override
    void m1(String word) {
        System.out.println("m1 method with parameter");
    }
}
