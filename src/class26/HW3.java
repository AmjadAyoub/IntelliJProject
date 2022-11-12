package class26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HW3 {
    /*How can you remove all duplicates from ArrayList?*/
    public static void main(String[] args) {

List<String> aList=new ArrayList<>();
aList.add("John");
aList.add("Jane");
aList.add("James");
aList.add("Jasmine");
aList.add("Jane");
aList.add("James");

     //   System.out.println(new LinkedHashSet<>(aList)); We can use this way by converting the arraylist to Linkedhashset
// ot we can use the below way by converting the arraylist to hashset
        var hashset=new HashSet<>(aList);
        System.out.println(hashset);






    }

}
