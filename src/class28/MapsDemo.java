package class28;

import java.util.HashMap;

public class MapsDemo {
    public static void main(String[] args) {
        HashMap<String,Double> items=new HashMap<>();
        items.put("Iphone 14",1000.0);
        items.put("Eggs",2.40);
        items.put("Apples",5.0);
        items.put("Keyboard",100.0);
        items.put("flower",1.0);
        // I want to remove the items if their price is more than 10
      /*  Iterator<Double> iterator= items.values().iterator(); // first we are getting a collection of values
        while(iterator.hasNext()){
            Double price=iterator.next();
            if(price>10){
                iterator.remove();
            }
        }*/
        // we can use the below lambda instead of above iterator.
       items.values().removeIf(price-> price>10);
        System.out.println(items);





    }
}
