package class28;

import java.util.TreeMap;

public class HW4 {
    /*Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object. Print each object details.  */
    public static void main(String[] args) {
        TreeMap <Integer,Person> person = new TreeMap<>();
        person.put(5689,new Person("Joe","Brown",32,90000));
        person.put(9564,new Person("Amjad","Ayoub",42,150000));
        person.put(582015,new Person("Moe","Ayoubi",36,80000));
   for(var obj:person.values()) {
       System.out.println(obj.userDetails());

}




    }
}
class Person {

    private String name;
    private String lastName;
    private int age;
    private int salary;

    public Person(String name, String lastName, int age, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    String userDetails(){
        return name+" "+lastName+" is "+age+" years old and his salary is "+salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}



