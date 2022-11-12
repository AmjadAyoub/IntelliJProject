package Replits;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Replit206 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ONE", "AAA");
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");
        System.out.println("HashMap Before Remove :");
        for (Map.Entry<String, String> set : map.entrySet()) {

            System.out.println(set.getKey()+" : " + set.getValue());
        }
        map.remove("ONE");
        map.remove("FOUR");
        System.out.println("------------------");
        System.out.println("HashMap After Remove :");
        Set<Map.Entry<String, String>> entry = map.entrySet();


        for (Map.Entry<String, String> set : entry) {

            System.out.println(set.getKey()+" : " + set.getValue());
        }

    }

}





