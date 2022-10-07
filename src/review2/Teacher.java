package review2;

public class Teacher {

    String name, lastName;  // instance variables
    int experience;     // instance variables
    String subject;     // instance variables
    double salary;      // instance variables

    static String school;

    // how to create a constructor
    /*
    1. constructor name=class name
    2. no return type , not even void
      3. when we do not create a constructor, the compiler cretaes a default one for us
     Using below constructor, we initialize instance variables:(name, lastName)
     */

    Teacher(String fName, String lName) {     // this is a constructor. Starts with class name Teacher (fName & lName are local variables)
        name=fName;
        lastName=lName;
    }

    // when you create a constructor, compiler is NOT going to create a default constructor for you

    void print() {
        System.out.println(name+" "+lastName);  // always in the method we have to use the instance variables as parameters because
                                                 // local variables cannot be called outside the  block of codes
    }

}

 class School {
     public static void main(String[] args) {

         Teacher t1=new Teacher("Asghar", "Nazir");  // here i have to create the constructor because i already created one in line 20
          t1.print();

          Teacher t2=new Teacher("Moazzam", "Sadiq");
          t2.print();


     }


}


