package class23;

public class Replit176 {

    public static void main(String[] args) {
       Main1 obj = new Main1();
       obj.parentMethod();
       obj.childMethod();


        }

    }


interface ParentInterface {

    void parentMethod();
}

interface ChildInterface extends ParentInterface {
    void childMethod();

}

class Main1 implements ChildInterface {


    @Override
    public void parentMethod() {
        System.out.println("Parent Method-welcome to Syntax");
    }

    @Override
    public void childMethod() {
        System.out.println("Child Method-hello Syntax");
    }
}


