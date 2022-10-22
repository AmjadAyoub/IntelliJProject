package project;

public class Task1 {
      static Shape Circle;
     static Shape Square;

    /* Create an Interface 'Shape' with undefined
    methods as calculateArea and
    calculatePerimeter. Create 2 classes Circle &
    Square that implements functionality defined in
    the Shape Interface. Test your code.*/
    public static void main(String[] args) {
    /*   Circle obj1=new Circle();
        obj1.calculateArea();
        obj1.calculatePerimeter();

        Square obj2=new Square();
        obj2.calculateArea();
        obj2.calculatePerimeter();  */


       Shape [] array= {new Circle(),new Square()};
        for(Shape arr:array) {
            arr.calculateArea();
            arr.calculatePerimeter();
        }



    }

}
interface Shape {
    void calculateArea();
    void calculatePerimeter();
}
class Circle implements Shape {
    double radius=5;
    public void calculateArea() {
        System.out.println("The area of circle is "+(3.14*(radius*radius)));
    }
    public void calculatePerimeter () {
        System.out.println("The perimeter of square is "+(3.14*radius*2));
    }

}

 class Square implements Shape{
     double side=8;
     public void calculateArea() {
        System.out.println("The area of square is "+side*side);
    }
    public  void calculatePerimeter () {
        System.out.println("The perimeter of square is "+side*4);
    }

}
