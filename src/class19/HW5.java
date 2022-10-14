package class19;

public class HW5 {
    //Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class. In circle class create a
    //method to calculate the area of circle. Test your code
}
    class Shape {
        int radius;


        Shape(int radius) {
            this.radius = radius;
        }

        public static void main(String[] args) {


            Circle circle = new Circle(5);
            circle.printInfo();

        }
    }

    class Circle extends Shape {
        Circle(int radius) {
            super(radius);
        }
        void printInfo() {
            System.out.println("The area of the circle is " + (3.14 * (radius * radius)));
          //  System.out.println(Math.PI*Math.pow(radius,2));   I can use this formula instead of line 21
    }


    }



