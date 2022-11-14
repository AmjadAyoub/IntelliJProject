package class28;

import java.util.HashMap;

public class HW3 {
    /*Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.  */
    public static void main(String[] args) {
        var store= new HashMap<>();
        store.put(777,"Printer");
        store.put(284,"TV");
        store.put(219,"Scanner");
        store.put(999,"Phone");
        var entry= store.entrySet();
        System.out.println(entry);

        for(var item:entry) {
            System.out.println(item.getKey()+" is the code of the "+item.getValue());
        }








    }
}
