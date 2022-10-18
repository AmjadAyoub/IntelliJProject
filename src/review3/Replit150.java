package review3;

public class Replit150 {

    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.print();
        Student student=new Student();
        student.print();
        Retiree retiree=new Retiree();
        retiree.print();


    }

}
class Person {
    String name;
    String lastName;
    int age;



}
class Employee extends Person {
    int salary;
    void print() {
        System.out.println("Joe"+" "+"Smith"+" "+35+" "+35000);
    }

}
class Student extends Employee {
    int grade;

    @Override
    void print() {
        System.out.println("Adam"+" "+"Smith"+" "+15+" "+10);
    }
}
class Retiree extends Student {
    String seniorActivity;
    void print() {
        System.out.println("Frank"+" "+"Smith"+" "+15+" "+"tour");
    }

}