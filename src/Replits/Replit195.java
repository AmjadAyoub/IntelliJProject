package Replits;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Replit195 {
    public static void main(String[] args) {

        HashSet <Integer> numbers= new HashSet<>(Arrays.asList(111,111,111,999,999,999));
        LinkedHashSet <Integer> nums= new LinkedHashSet<>(numbers);
        Iterator<Integer> iterator = nums.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());

        }


    }
}
