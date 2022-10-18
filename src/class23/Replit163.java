package class23;

public class Replit163 {
    public static void main(String[] args) {
        Parent.name();
        Child.name();

    }


}

class Parent {
    static void name() {
        System.out.println("Parent method");
    }


}


class Child extends Parent {
     static void name() {
        System.out.println("Child method");
    }
}
