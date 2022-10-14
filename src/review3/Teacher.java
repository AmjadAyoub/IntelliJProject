package review3;

public class Teacher {
    public String name,lname;
    protected String subject;
    int experience;
    private double salary;

    public static String school;
    // this. - used to refer to the currect object: instance variables
    public Teacher(String name, String lname) {
        this.name=name;                                 // here is an example of constructor overloading in same class but different parameters
        this.lname=lname;
    }
     // this() - refers to the current object : current class constructor
    Teacher (String name, String lname, String subject) {
        this(name,lname);
        this.subject=subject;

    }
    Teacher (String name, String lname, int experience) {
        this(name, lname);
        this.experience=experience;
    }

    // static members (variables & methods) can work only with static
    public static void work() {
        System.out.println("All teachers work at "+school);
       // print();  we cannot call a non static method in static method
    }
    protected void print() {
        System.out.println("Teacher name is "+name+" "+lname);
        work();  // we can call a static method in non static method
    }
    void teach() {
        print();    // calling print method
        System.out.println(name+" teaches "+subject);
    }

    // method that will calculate bonus based on experience and returns it.

    private double getBonus() {
        if (experience<5) {
            return 3;
        } else {
            return 3.5;
        }
    }

}

class School {
    public static void main(String[] args) {
        Teacher t=new Teacher("John","Smith");
        System.out.println(t.name);

        Teacher t1= new Teacher("Jane","Smith","Biology");
        t1.teach(); // calling teach method will get output: "Teacher name is Jane Smith" from print method and "Jane teaches Biology" from teach method
        Teacher t2=new Teacher("Jack","Smith",5);
        Teacher.school="Syntax";
        Teacher.work();   // calling work method: All teachers work at Syntax

        t2.print();
        t2.teach();
       // t2.getBonus(); Cannot be called because getBonus method is private.

    }
}
