package class14;

import java.util.Scanner;

public class HW4 {

    // Create a method that will say Hello in different language based on the country that will passed when method is executed

    void language (String country) {
        if(country.equalsIgnoreCase("Lebanon")) {
            System.out.println("Marhaba");
        } else if(country.equalsIgnoreCase("Canada")) {
            System.out.println("Hello");
        } else if (country.equalsIgnoreCase("Russia")) {
            System.out.println("Brevet");
        }   else if (country.equalsIgnoreCase("Russ")) {
            System.out.println("Brev");
        }       else if (country.equalsIgnoreCase("India")) {
                System.out.println("hola");
        } else {
            System.out.println("I do not know");
        }


    }

    public static void main(String[] args) {
        HW4 lang = new HW4();
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a country name");
        String countryName=scan.nextLine();
        lang.language(countryName);
    }

}
