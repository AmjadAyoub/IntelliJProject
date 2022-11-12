package class27;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapDemo4 {
    public static void main(String[] args) {

    HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 1.99);
        fruit.put("Mango", 2.99);
        fruit.put("Orange", 4.99);
        fruit.put("Banana", 10.1);

        Collection<String> allKeys=fruit.keySet();  // getting all the keys in the form of a Set.
      //  Set<String> allKeys=fruit.keySet(); // we can do this instead of line 16
        System.out.println(allKeys);  // [Apple, Mango, Orange, Banana]
        Iterator<String> iterator = allKeys.iterator(); // Getting an iterator on that Set
        while (iterator.hasNext()) {
            String item=iterator.next();
            if(item.contains("n")) {
                iterator .remove();

                }
            }
     //   fruit.keySet().removeIf(x-> x.contains("n"));  we can use lambda to get same result. Replaces lines 16 to 23
        System.out.println(fruit);
        }

}

