package class28;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class HW6 {
    /*Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.  */
    public static void main(String[] args) {

        LinkedHashSet <String> objects= new LinkedHashSet<>(Arrays.asList("S","Y","N","T","A","X"));
        for(var obj:objects) {
            System.out.print(obj);
        }



    }
}
