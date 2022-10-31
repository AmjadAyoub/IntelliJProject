package class24;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Tymur");
        names.add("Salma");
        names.add("MJ");
        names.add("Josh");
        names.add(2,"Josh Again"); // will relocate the variable and shift the rest
        names.set(2,"Josh again"); // will replace the variable

        System.out.println(names);

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(35);
        numbers.add(1,100);
        System.out.println(numbers);
        numbers.set(1,75);
        System.out.println(numbers);
        numbers.clear();  // deletes all the elements from the list
        System.out.println(numbers);










    }

}
