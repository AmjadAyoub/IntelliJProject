package class26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class WhenToUseSets {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(40);
        numbers.add(50);
        numbers.add(50);
        numbers.add(50);
        System.out.println(numbers);

//converting arraylist to linkedhashset
        System.out.println(new LinkedHashSet<>(numbers));

// converting linkedhashset to hashset
        HashSet<Integer> hashSet=new HashSet<>(numbers);
        System.out.println(hashSet);
     //   System.out.println(new hashset<>(numbers));  CANNOT DO THAT

        //converting hashset to linkedlist
        LinkedList<Integer> linkedList = new LinkedList<>(hashSet);
        System.out.println(linkedList);




    }
}
