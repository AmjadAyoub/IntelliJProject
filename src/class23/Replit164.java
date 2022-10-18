package class23;

public class Replit164 {
    public static void main(String[] args) {

        Parent1 [] arr= {new child1(), new child2(), new child3()};
     for(Parent1 array:arr) {
         array.hello();
     }


    }

}

class Parent1 {

    void hello() {
        System.out.println("method in Parent class");
    }

}
class child1 extends Parent1 {
    void hello() {
        System.out.println("method in Child1 class");
    }

}
class child2 extends Parent1 {
    void hello() {
        System.out.println("method in Child2 class");
    }

}
class child3 extends Parent1 {
    void hello() {
        System.out.println("method in Child3 class");
    }

}
