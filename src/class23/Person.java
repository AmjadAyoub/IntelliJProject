package class23;



public interface Person {
    void eat();
}

interface Employee{
    void work();
}

interface SyntaxEmployee extends Employee, Person {
    void creatRepl();
}
class Asghar implements SyntaxEmployee{

    @Override
    public void eat() {
        System.out.println("Like to eat grilled Fish");
    }

    @Override
    public void work() {
        System.out.println("Teaches Bacth14 ");
    }

    @Override
    public void creatRepl() {
        System.out.println("Create easy Repls");
    }
}

class Tester {
    public static void main(String[] args) {
        Asghar obj= new Asghar();
        obj.creatRepl();
        obj.eat();
        obj.work();




    }

}
