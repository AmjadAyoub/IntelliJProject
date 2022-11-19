package Replits;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Replit207 {
    public static void main(String[] args) {

        Map map= new HashMap<String,String>();
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");

        System.out.println("HashMap Before Replace :");

       Iterator iterator = map.entrySet().iterator();
       while(iterator.hasNext()) {
           Map.Entry m = (Map.Entry) iterator.next();

           System.out.println(m.getKey() + " : " + m.getValue());
       }

           map.replace("THREE", "ASEL");
           map.replace("FIVE", "SUMAIR");
           System.out.println("HashMap After Replace :");
           Iterator iterator1 = map.entrySet().iterator();
           while (iterator1.hasNext()) {
               Map.Entry m1 = (Map.Entry) iterator1.next();

               System.out.println(m1.getKey() + " : " + m1.getValue());


           }

       }
    }

