package class14;

import java.util.Scanner;

public class HW1 {

    //Create a method that will take 2 parameters as a numbers and prints which number is larger.
    void num(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else  {
            System.out.println(num2 + " is greater than " + num1);
        }

    }

    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        int number1=scan.nextInt();
        int number2=scan.nextInt();
        HW1 number = new HW1();
        number.num(number1, number2);
    }
}

