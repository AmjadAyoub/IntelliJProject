package class23;

public class Replit174 implements MyInterface {


    @Override
    public void method1() {
        System.out.println("implementation of method1");
    }

    @Override
    public void method2() {
        System.out.println("implementation of method2");

    }

}
   class MethodTester{
    public static void main(String[] args) {
        Replit174 obj= new Replit174();
        obj.method1();
        obj.method2();


    }
}

interface MyInterface  {
    void method1();
    void method2();

}

