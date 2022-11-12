package class26;

import java.util.LinkedHashSet;

public class HW5 {
    /*Create a Set of cities in which you want to make sure that insertion order is maintained.
    Then remove any city that starts with “A”; */
    public static void main(String[] args) {

        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Beirut");
        cities.add("Toronto");
        cities.add("Towson");
        cities.add("Allepo");
        cities.add("Brampton");
        System.out.println(cities);

        // using Lambda
        cities.removeIf(x->x.contains("A"));
        System.out.println(cities);


// using Iterator
   /*   Iterator<String> iterator= cities.iterator();
      while(iterator.hasNext()) {
          String city= iterator.next();
          if(city.startsWith("A")) {
              iterator.remove();
          }

        }

        System.out.println(cities);



    }*/

        // fruit.values().removeIf(amjad->amjad>2);
    }
}
