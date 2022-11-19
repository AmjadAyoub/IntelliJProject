package review7;

import java.util.*;

public class MapDemo1 {
    public static void main(String[] args) {
        HashMap<String,Double> items=new HashMap<>();
        items.put("iPhone",1000.00);
        items.put("Eggs",20.4);
        items.put("Apples",2.50);
        items.put("Keyboard",100.0);
        items.put("Flower",1.0);
        Set<String> keys= getKeys(items);
        for (String key : keys) {
            System.out.println(key);
        }
    }

    public static Set<String> getKeys(Map<String,Double> map){

        return map.keySet();
    }
}

// using arraylist instead of Set


class MapDemo2 {
    public static void main(String[] args) {
        HashMap<String, Double> items = new HashMap<>();
        items.put("iPhone", 1000.00);
        items.put("Eggs", 20.4);
        items.put("Apples", 2.50);
        items.put("Keyboard", 100.0);
        items.put("Flower", 1.0);
        List<String> keys = getKeys(items);
        for (String key : keys) {
            System.out.println(key);
        }
// getting the values of the map in a list
        List<Double> values = getValues(items);
        System.out.println(values);
    }

    public static List<String> getKeys(Map<String, Double> map) {

        return new ArrayList<>(map.keySet());
    }

    public static List<Double> getValues(Map<String, Double> map) {
        return new ArrayList<>(map.values());
    }
}
