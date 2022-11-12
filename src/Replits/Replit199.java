package Replits;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Replit199 {
    public static void main(String[] args) {
        LinkedHashSet <String> names= new LinkedHashSet<>(Arrays.asList("null","Sohil","Diego","Alijon","Asel","Sumair"));

        for (String name : names) {
            System.out.println(name);

        }
        var iterator = names.iterator();
        while (iterator.hasNext()) {
            var name = iterator.next();
            System.out.println(name);
        }
    }
}
