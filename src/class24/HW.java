package class24;

import java.util.ArrayList;
import java.util.Arrays;

public class HW {
    /*Create an ArrayList that will store 5 names into it.
    Find out whether the given ArrayList is empty or not?
    Check whether the specific name is present in an ArrayList or not?
    Find the size of your arrayList and print all values from that*/


    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>(Arrays.asList("Amjad","Farah","Moe","Waad","Ahmad"));
        // or we can do the below to add the names
        /* names.add("Amjad");
        names.add("Farah");
         */

        System.out.println(names.isEmpty()); // false
        ArrayList<String> name= new ArrayList<>();

        System.out.println(names);
        System.out.println(names.contains("Moe"));

        if(name.isEmpty()) {
            System.out.println("Array is empty");
        } else {
            System.out.println(names);
        }

        if(names.contains("Farah")){
            System.out.println(names.get(1)+ " is present in the array");
        }

        System.out.println("The size of the array is "+names.size());
        System.out.println(names);
    }



}
