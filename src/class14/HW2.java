package class14;

public class HW2 {


    // Create a method that will take a number and prints whether the number is even or odd.
    void isEvenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }
    }

    public static void main(String[] args) {
        HW2 number = new HW2();
        number.isEvenOrOdd(20);
    }
}
