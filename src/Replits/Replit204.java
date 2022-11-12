package Replits;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Replit204 {
    public static void main(String[] args) {
        LinkedHashMap <String,String> address=new LinkedHashMap<>();
        address.put("Street","Patrick ST");
        address.put("Suite","265");
        address.put("City","Vienna");
        address.put("Zip","22180");
        address.put("Country","United State");

        // 1st way
     /*   Collection<String> amjad=address.values();
        for(String name:amjad) {
            System.out.println(name);
        }   */

        //2nd way
        Iterator iterator = address.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry m= (Map.Entry) iterator.next();
            System.out.println(m.getValue());
        }




    }
}
