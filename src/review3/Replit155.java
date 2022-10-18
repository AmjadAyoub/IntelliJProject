package review3;

public class Replit155 {
    public static void main(String[] args) {

        C1 c1= new C1();
        c1.print1();
        c1.print2();
        c1.print3();
    }
}
class A1 {

    void print1() {
        System.out.println("I");
    }

}
class B1 extends A1 {

    void print2() {

        System.out.println("am");
    }
}

class C1 extends B1 {

    void print3() {
        System.out.println("a tester");
    }
}
