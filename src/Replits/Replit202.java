package Replits;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Replit202 {
    public static void main(String[] args) {

        TreeMap <String,String> fruits= new TreeMap<>();
        fruits.put("1 item","apple");
        fruits.put("2 item","banana");
        fruits.put("3 item","pear");
        fruits.put("4 item","tomato");
        fruits.put("5 item","mango");
        fruits.put("6 item","kiwi");

       Iterator iterator = fruits.entrySet().iterator();
       while (iterator.hasNext()){
           Map.Entry m= (Map.Entry) iterator.next();
           System.out.println("Key is "+m.getKey()+" and values is "+m.getValue());
       }

    }
}
