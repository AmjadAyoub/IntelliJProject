package Replits;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Replit203 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        map.put("mango", 40);
        map.put("mango", 40);
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry m = (Map.Entry) iterator.next();
            System.out.println("Key = " + m.getKey() + " and value = " + m.getValue());


        }
    }
}
