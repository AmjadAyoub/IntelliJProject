package class23;

public class Replit166 {

    public static void main(String[] args) {
        Animal1[] arr = {new Cat1("Cat", "", "a lot"), new Kitten1("Kitten1","milk","a lot"), new Kitten2("Kitten2","snacks","alot"),
                new Kitten3("Kitten3", "everything", "a lot")};
        for(Animal1 array: arr) {
            array.eat();
            array.sleep();
        }


        }
    }




class Animal1 {
    String eat;
    String sleep;
    String name;

    public Animal1(String name, String eat, String sleep) {
        this.eat = eat;
        this.sleep = sleep;
        this.name=name;
    }
    void eat () {
        System.out.println(name+ " eats");
    }
    void sleep () {
        System.out.println(name+" sleeps "+ sleep);
    }

}
class Cat1 extends Animal1 {


    public Cat1(String name, String eat, String sleep) {
        super(name, eat, sleep);
    }

    void sleep () {
        System.out.println(name+" sleeps "+ sleep);
    }

}
class Kitten1 extends Cat1 {

    public Kitten1(String name, String eat, String sleep) {
        super(name,eat, sleep);
    }
    void eat () {
        System.out.println(name+" eats "+ eat);
    }

    }

class Kitten2 extends Cat1 {

    public Kitten2(String name, String eat, String sleep) {
        super(name,eat, sleep);
    }
    void eat () {
        System.out.println(name+" eats "+ eat);
    }

}
    class Kitten3 extends Cat1 {

        public Kitten3(String name, String eat, String sleep) {
            super(name,eat, sleep);
        }
        void eat () {
            System.out.println(name+" eats "+ eat);
        }

    }

