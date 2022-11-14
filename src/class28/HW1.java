package class28;

import java.util.HashMap;
import java.util.Map;

public class HW1 {
    /*Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map */
    public static void main(String[] args) {
        Map<Integer,String> building = new HashMap<>();
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(3,"Twitter");
        building.put(4,"HSBC");
        building.put(5,"TD");
        building.put(6,"Facebook");
        building.put(7,"Costco");
        System.out.println(building.size());
        building.replace(4,"Chase");
        building.keySet().removeIf(x->x.equals(7));
        System.out.println(building);






    }
}
