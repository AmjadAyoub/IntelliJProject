package Replits;

import java.util.Collection;
import java.util.LinkedHashMap;

public class Replit200 {
    public static void main(String[] args) {
        LinkedHashMap<String,String> objects= new LinkedHashMap<>();
        objects.put("Street","Patrick ST");
        objects.put("Suite","265");
        objects.put("City","Vienna");
        objects.put("Zip","22180");
        objects.put("Country","United State");


        Collection <String> amjad=objects.values();

for(String name:amjad) {
    System.out.println(name);
}


    }
}
