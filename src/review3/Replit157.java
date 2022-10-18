package review3;

public class Replit157 {

    public static void main(String[] args) {
        Child2 obj= new Child2();
        obj.m2();


    }


}

class Parent2 {

   static void m1() {
        System.out.println("m1 method in parent class");
    }

}

class Child2 extends Parent2 {
  static  void m1() {
        System.out.println("m1 method in child class");
    }

    void m2() {
      Child2.m1();
      Parent2.m1();

    }

}


