package review3;

public class Replit146 {
    public static void main(String[] args) {
        Employee1 employee = new Employee1 ();
        employee.print();
        Employee1 employee1 = new Employee1 ("Joe"," Smith", 12345,"01/01/1970", 35000);
        employee1.print();
    }


}

class Employee1 {
    String name;
    String lastName;
    int employee;
    String startDate;
    int salary;

    Employee1 () {

    }

     Employee1(String name, String lastName, int employee, String startDate, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.employee = employee;
        this.startDate = startDate;
        this.salary = salary;
    }
    void print () {
        System.out.println(name+" "+lastName+" "+employee+" "+startDate+" "+salary);
    }


}
