package class19;

public class Student {
    //Write a Student class   that have instance variables name and address. Create a constructor that will initialize those variables.
    //Print name & address of given  student using displayInfo method.

    String name;
    int houseNumber;
    String streetName;
    String cityAndState;
    int zipCode;


    public Student(String name, int houseNumber, String streetName, String cityAndState, int zipCode) {
        this.name = name;
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.cityAndState = cityAndState;
        this.zipCode = zipCode;
    }
    public void printInfo() {
        System.out.println(name+" "+houseNumber+" "+streetName+" "+cityAndState+" "+zipCode);
}



    public static void main(String[] args) {

        new Student("Alex",552,"Towson Rd", "Baltimore MD", 21594).printInfo();
    }

    }
