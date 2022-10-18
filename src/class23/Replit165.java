package class23;

public class Replit165 {

    public static void main(String[] args) {
        Child2 obj = new Child2();
        obj.display2();
        obj.display3();
        obj.display4();
    }


}

class Parent2{
    private void display1() {
        System.out.println("I am parent private method");
    }
     public void display2() {
        System.out.println("I am parent public method");
    }
    protected void display3() {
        System.out.println("I am parent protected method");
    }
     void display4() {
        System.out.println("I am parent default method");
    }

}

class Child2 extends Parent2 {
    private void display1() {
        System.out.println("I am a child private method");
    }
    public void display2() {
        System.out.println("I am a child public method");
    }
    protected void display3() {
        System.out.println("I am a child protected method");
    }
     void display4() {
        System.out.println("I am a child default method");
    }


}

