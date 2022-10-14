package class19;

public class Task {

    public static void main(String[] args) {
       C c = new C();  // outcome: A B C
        B b=new B(); // outcome: A B

    }
}

    class A{

        A() {
            System.out.println("A");
        }

    }
    class B extends A{
      B(){
          System.out.println("B");
      }


    }

    class C extends B{
        C() {
            System.out.println("C");
        }

    }

