package review6;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;

public class MapDemo {
    public static void main(String[] args) {

        // HashMap: does not retain the order, bit it is fastest
        // LinkedHshMap: it retains the order but it is slower than HashMap
        //TreeMap: when we want to sort the data, but it is slowest

        Map<String,Double> vegeList= new LinkedHashMap<>();
        TreeSet<String> hashSet = new TreeSet<>();
        hashSet.add(null); // u cannot add null value in tree set. you can with hash and linked
        System.out.println(hashSet); // error
// compiler compares the number that you want to add to the existing numbers in treeSet. if it is bigger than existing, it locates
        // it on the right side of the existing number and to left side if smaller. but if null i cannot compare it that is why it gives us an error

    }
}
