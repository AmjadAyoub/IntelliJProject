package review3;

public class Replit149 {
    public static void main(String[] args) {
        A a = new A();
        a.print();

        B b = new B();
        b.print();

    }
}
class A {
   void print() {
       System.out.println("Class A");
   }

}
class B extends A {
    void print() {
        System.out.println("Class B");

    }
}