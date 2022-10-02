package class14;

import java.util.Scanner;

public class HW3 {

    // Create a method that will print whether given String is palindrome or not.

    void str(String word) {
        word=word.toLowerCase();

        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        if (sb.toString().equals(word)) {
            System.out.println(word + " is Palindrome");
        } else {
            System.out.println(word + " is not Palindrome");
        }

    }

    public static void main(String[] args) {
        HW3 palindrome = new HW3();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = scan.next();
        palindrome.str(word);

    }
}


