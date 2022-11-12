package class26;

import java.util.Iterator;
import java.util.TreeSet;

public class HW4 {
    /*Create a Set collection in which you need to add names of the countries.
    In this set we want all objects to be sorted in alphabetical order. Using 2 different ways retrieve all elements from set.
     */
    public static void main(String[] args) {


        TreeSet<String> countries = new TreeSet<>();
        countries.add("Palestine");
        countries.add("Lebanon");
        countries.add("USA");
        countries.add("Canada");

        System.out.println(countries);

        System.out.println("******************");

        for(String obj:countries) {
            System.out.println(obj);
        }

        System.out.println("***************");

        Iterator <String> iterator = countries.iterator();
        while(iterator.hasNext()) {
            String country=iterator.next();
            System.out.println(country);
        }





    }
}
