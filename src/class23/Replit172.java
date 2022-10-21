package class23;

public class Replit172 extends Bell {
    void m1() {
        System.out.println("Parent class providing implementation");
    }
    public static void main(String[] args) {
        Bell obj = new Replit172();
        obj.m2();
        obj.m1();

    }


}

abstract class Bell {
    void m2 () {
        System.out.println("Child class providing implementation");
    }
    abstract void m1();

}


