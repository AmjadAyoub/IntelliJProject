package class25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class HW1 {
    public static void main(String[] args) {

        //Create an arrayList of words. Remove every word that ends with “e”.

        // ArrayList <String> words = new ArrayList<>(Arrays.asList("bike","car","boat","bee","eye","sky"));
        var words = new ArrayList<String>(Arrays.asList("bike","car","boat","bee","eye","sky"));
         Iterator<String> iterator = words.iterator();
         while (iterator.hasNext()) {
             var item=iterator.next();
            if(item.endsWith("e")) {
                iterator.remove();
             }
        }
        System.out.println(words);

    }
}
