package class18;

public class Cat extends Animal {      // extended from Animal class
   /* String name;
    String breed;
    int age;
    double weight; */

    public Cat(String catName, String catBreed
    ) {
        name = catName;
        breed = catBreed;

    }

    public Cat(String catName, String catBreed,
               int catAge, double catWeight) {
        name = catName;
        breed = catBreed;
        age = catAge;
        weight = catWeight;
    }

    public void printInfo() {
        System.out.println("Name " + name + " Breed " + breed +
                " age " + age + " Weight " + weight);
    }
}

     class CatTester {
    public static void main(String[] args) {
        Cat cat = new Cat("kitty",
                "Dsh", 10, 4);

        cat.printInfo();

        Cat cat2 = new Cat("Chinki", "Leo");
        cat2.printInfo();
    }
}
