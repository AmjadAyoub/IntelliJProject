package Replits;

import java.util.HashMap;
import java.util.Map;

public class Replit201 {
    public static void main(String[] args) {
        Map<String,String> objects= new HashMap<>();
        objects.put("Street","Patrick ST");
        objects.put("Suite","265");
        objects.put("City","Vienna");
        objects.put("Zip","22180");
        objects.put("Country","United State");


        System.out.println(objects.size());
        objects.clear();
        System.out.println(objects.size());




    }
}
