package class20;

public class HW1 {
    //Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    //Rectangle Square Box. Use separate class to test your code
    public static void main(String[] args) {

        Area areaorvolume = new Area();
        areaorvolume.AreaOrVolume(5.6);
        areaorvolume.AreaOrVolume(6.5, 2.3);
        areaorvolume.AreaOrVolume(4.4, 3.1, 5.1);

    }
}

class Area {
    void AreaOrVolume(double length, double width) {
        System.out.println("Area of the Rectangle is " + (length * width));
    }

    void AreaOrVolume(double length) {
        System.out.println("Area of the square is " + (length * length));

    }

    void AreaOrVolume(double length, double width, double height) {
        System.out.println("Volume of the box is " + (length * width * height));


    }
}
