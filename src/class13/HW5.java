package class13;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {

        // How would you check if String is palindrome or not? aba=> true
        //Abbc =>false

        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        StringBuilder str2=new StringBuilder(str);
        if(str.equals(str2.reverse().toString())) {

            System.out.println(str+ " is a palindrome word");
        } else {
            System.out.println(str+ " is not a palindrome word");
        }




    }
}
