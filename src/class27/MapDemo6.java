package class27;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo6 {

    public static void main(String[] args) {

        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 1.99);
        fruit.put("Mango", 2.99);
        fruit.put("Orange", 4.99);
        fruit.put("Banana", 10.1);

      /*  Set< Map.Entry<String,Double>> entrySet= fruit.entrySet();
        Iterator<Map.Entry<String,Double>> iterator=entrySet.iterator(); */

        Iterator it= fruit.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry m = (Map.Entry) it.next();
            System.out.println(m.getKey() + " - "+ m.getValue());
        }


    }
}
