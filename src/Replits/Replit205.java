package Replits;

import java.util.HashMap;

public class Replit205 {
    public static void main(String[] args) {
        HashMap<String, String> address = new HashMap<>();
        address.put("Street", "Patrick ST");
        address.put("Suite", "265");
        address.put("City", "Vienna");
        address.put("Zip", "22180");
        address.put("Country", "United State");
        var iterator = address.entrySet().iterator();

        while (iterator.hasNext()) {
            var item = iterator.next();
            var value = item.getValue();
            System.out.println(value.toUpperCase());


        }

    }
}
