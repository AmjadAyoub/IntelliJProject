package class27;

import java.util.HashMap;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 1.99);
        fruit.put("Mango", 2.99);
        fruit.put("Orange", 4.99);
        fruit.put("Banana", 10.1);
        fruit.put("Banana", 12.0);  // replaces value of Banana from 10.1 to 12.0
        System.out.println(fruit); // {Apple=1.99, Mango=2.99, Orange=4.99, Banana=12.0}

       Set<String> keySet= fruit.keySet(); // returns all the keys in the form of Set
        System.out.println(keySet);  // [Apple, Mango, Orange, Banana]
        var values = fruit.values(); // returns all the values in the form of a collection
        System.out.println(values);  // [1.99, 2.99, 4.99, 12.0]




    }
}
