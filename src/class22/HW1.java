package class22;

public class HW1 {
    /*Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism*/

    public static void main(String[] args) {
        Student [] arrays= {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent() };
          for (Student array:arrays) {
              array.name();
              array.age();
              array.height();

             new SyntaxStudent().weight();
             new CollegeStudent().citizenship();
          }




    }

}
class Student {
    void name() {
        System.out.println("My name is Amjad");
    }
    void age() {
        System.out.println("My age is 40");
    }
    void height () {
        System.out.println("My height is 5.9");
    }


}

class SyntaxStudent extends Student {
    void name() {
        System.out.println("My name is Mo");
    }
    void age() {
        System.out.println("My age is 35");
    }
    void weight() {
        System.out.println("My weight is 180 lbs");
    }

}

class CollegeStudent extends Student {
    void name() {
        System.out.println("My name is Waad");
    }
    void age() {
        System.out.println("My age is 40");
    }
    void citizenship() {
        System.out.println("My citizenship is American");
    }

}

class SchoolStudent extends Student {
    void name() {
        System.out.println("My name is Ahmad");
    }
    void age() {
        System.out.println("My age is 30");
    }


}
