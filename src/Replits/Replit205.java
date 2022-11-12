package Replits;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Replit205 {
    public static void main(String[] args) {
        HashMap<String,String> address=new HashMap<>();
        address.put("Street","Patrick ST");
        address.put("Suite","265");
        address.put("City","Vienna");
        address.put("Zip","22180");
        address.put("Country","United State");
        Iterator iterator = address.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry m= (Map.Entry) iterator.next();
            m.getValue();
         String list= m.toString().toUpperCase();
            System.out.println(list);




        }

    }
}
