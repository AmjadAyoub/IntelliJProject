package class18;

public class Dog extends Animal {
    /* String name; // extedned from Animal class
    String breed;
    int age;
    double weight; */
    String color;

    double height;


    public Dog(String name, String breed, String color, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;

    }
    public Dog(String name, String breed, String color, int age, double weight, double height) {
       /* this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight; */
        this(name, breed, color, age, weight);  // lines 21 to 25 are common between two methods so we can replace them by line 26
        this.height = height;
    }
}
