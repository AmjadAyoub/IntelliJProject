package class26;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TypesOfSets {
    public static void main(String[] args) {
        //there are 3 types of sets
        /*
        HashSet: it does not care about the insertion order and does not print duplicates
         */


        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("Mango");
        hashSet.add("Apple");
        hashSet.add("Kiwi");
        hashSet.add("Orange");
        hashSet.add("Banana");
        hashSet.add("Apple");
        System.out.println(hashSet);


        // insertion speed is same as HashSet but retrieval speed is the worst
        //it does care about the insertion order and does not print duplicates
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("Mango");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Kiwi");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Mango");
        System.out.println(linkedHashSet);

// whenever you need sorted data ascending order from a to z. No duplicates and does not print in order
        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("Mango");
        treeSet.add("Apple");
        treeSet.add("Kiwi");
        treeSet.add("Orange");
        treeSet.add("Banana");
        treeSet.add(("Kiwi"));
        System.out.println(treeSet);


    }
}
