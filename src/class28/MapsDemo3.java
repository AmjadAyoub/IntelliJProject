package class28;

import java.util.HashMap;
import java.util.Set;

public class MapsDemo3 {
    public static void main(String[] args) {
        HashMap<String, Double> items = new HashMap<>();
        items.put("Iphone 14", 1000.0);
        items.put("Eggs", 2.40);
        items.put("Apples", 5.0);
        items.put("Keyboard", 100.0);
        items.put("flower", 1.0);

        Set<String> keys = items.keySet();  // keyset method returns a Set that contains all the keys of a map
        for(String key:keys){
            System.out.println(key);
        }
      //  Collection<Double> values = items.values(); //// Values method returns a Set that contains all the values of a map
        for(Double value:items.values()){ // no need for line 20 if we are not going to use the variable values again
            System.out.println(value);
        }



    }
}
