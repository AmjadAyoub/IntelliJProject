package class27;

import java.util.HashMap;

public class MapDemo5 {
    public static void main(String[] args) {

        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 1.99);
        fruit.put("Mango", 2.99);
        fruit.put("Orange", 4.99);
        fruit.put("Banana", 10.1);

  /*    Collection<Double> values=fruit.values(); // returns all the values from a map
     //   ArrayList values= new ArrayList(fruit.values()); //we can use this instead of line 15

        Iterator<Double> iterator=values.iterator();
        while(iterator.hasNext()){
            Double value=iterator.next();
            if(value>2) {
             iterator.remove();
            }
        }

     //   System.out.println(fruit);  // {Apple=1.99} */

        // using Lambda can replace lines 14 to 25, and will give same result
        fruit.values().removeIf(amjad->amjad>2);
        System.out.println(fruit);   // {Apple=1.99}

    }
}
