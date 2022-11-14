package class27;

public class Dog {
    private String name;
    private String color;
    private String breed;

    public Dog(String name, String color, String breed) {
        setName(name);
        setBreed(breed);
        setColor(color);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
        // or we can type to and then select the last option (third one)
    }

  //  public String toString() {
   //     return name + " " + breed + " " + color;

        // or we can type to and then select the last option (third one)
 //   }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                '}';

    }
}

/*class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Dog> dogs=new ArrayList<>();

        // we can do it either way as below but better to do the second one because it is smaller unless we want to print each dog alone then we use the first way
     /*   Dog dog1 =new Dog ("Tomy","Black","German");
        Dog dog2=new Dog (("Jony","White","BullDog");
        Dog dog3=new Dog (("Kimi","Brown","German");
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3); */


     /*   dogs.add(new Dog("Tomy","Black","German"));
        dogs.add(new Dog("Jony","White","BullDog"));
        dogs.add(new Dog("Kimi","Brown","German"));

        Dog dog=new Dog("Tomy","Black","German");
     //   System.out.println(dog);

      //  System.out.println(dogs);


        //if we want to print wash dog alone then we have to use the first way
      /*  System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3); */

 //   }   /*
//    }   /*
