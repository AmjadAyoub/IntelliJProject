package class19;

 class Animal {
    String name;
    String breed;
    String color;

    Animal(String name, String breed, String color) {
        this.name = name;
        this.breed = breed;
        this.color = color;
    }

    public void printInfo() {
        System.out.println("Name "+name+" Breed "+breed+" Color "+color);
    }


}



 class Dog extends Animal {

  /*  String name;
    String breed;
    String color;*/

    /*public Dog(String name, String breed, String color) {
        this.name=name;
        this.breed=breed;
        this.color=color;*/
     Dog (String name, String breed, String color) {
         super(name,breed,color);
    }

  //  public void printInfo() {
   //     System.out.println("Name "+name+" Breed "+breed+" Color "+color);
  //  }


}
class Cat extends Animal {
   /* String name;
    String breed;
    String color;*/
  /*  Cat(String name, String breed, String color) {
        this.name=name;
        this.breed=breed;
        this.color=color; */
        Cat(String name, String breed, String color) {
            super(name,breed,color);
    }
  /*  public void printInfo() {
        System.out.println("Name "+name+" Breed "+breed+" Color "+color);
    }*/

    static class TestAnimal {

        public static void main(String[] args) {
            Dog dog=new Dog("jacky", "German", "Black");
            dog.printInfo();

            Dog cat=new Dog("Thomas", "Persian", "gold");
            cat.printInfo();
        }


    }


    }

