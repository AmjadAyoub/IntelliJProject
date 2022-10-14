package class20;

public class HW4 {
    //Create 1 class with a private method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.

    private void hW(String name, int number) {
        System.out.println("1");
    }


    private void hW(String name, int number, int number2) {
        System.out.println("2");
    }


    private void hW(int num1, int number) {
        System.out.println("3");
    }


    public static void main(String[] args) {
        HW4 hw4 = new HW4();

        hw4.hW("Alex", 44);
        hw4.hW("Tina", 25, 30);
        hw4.hW(17, 60);
    }
}
