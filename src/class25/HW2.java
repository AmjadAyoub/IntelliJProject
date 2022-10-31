package class25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class HW2 {
    // Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
    public static void main(String[] args) {
        var drinks=new ArrayList<String>(Arrays.asList("Tea","Red Bull","Milk","Lemonade"));
        Iterator <String> iterator= drinks.iterator();
        var count=0;
        while (iterator.hasNext()){
            var item=iterator.next();
            if(item.contains("a") || item.contains("e")) {
                drinks.set(count,"water");

            }
            count++;
        }
        System.out.println(drinks);

    }

}
