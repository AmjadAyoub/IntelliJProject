package class25;

import java.util.ArrayList;
import java.util.Arrays;

public class HW2AsgharWay {
    // Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
    public static void main(String[] args) {

        ArrayList <String> drinks=new ArrayList<>(Arrays.asList("Tea","Red Bull","Milk","Lemonade"));
        for (int i=0; i< drinks.size(); i++) {
            if(drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
                drinks.set(i,"Water");  // replace
            }
        }

        System.out.println(drinks);


    }
}
// ASGHAR WAY IS THE BEST APPROACH