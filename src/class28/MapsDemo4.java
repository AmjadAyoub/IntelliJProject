package class28;



import java.util.HashMap;


public class
MapsDemo4 {
    public static void main(String[] args) {
        String name;
        HashMap<String, Double> items = new HashMap<>();
        items.put("Iphone 14", 1000.0);
        items.put("Eggs", 2.40);
        items.put("Apples", 5.0);
        items.put("Keyboard", 100.0);
        items.put("flower", 1.0);

       // Set<Map.Entry<String, Double>>entrySet = items.entrySet();

        // we can use var instead of line 18
        var entrySet=items.entrySet();
        /* var dog=new Dog();  // var do not work with instance variables
        var number=10.2  */
        System.out.println(entrySet);

        for(var item :entrySet) {
            System.out.println(item.getKey()+" "+ item.getValue());
        }



    }
}
