package class28;

import java.util.TreeMap;

public class HW2 {
    /*Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator. */
    public static void main(String[] args) {
        TreeMap<String,String> countries=new TreeMap<>();
        countries.put("USA","Washington");
        countries.put("Lebanon","Beirut");
        countries.put("Canada","Ottawa");
        countries.put("UAE","Abu Dhabi");
        countries.put("Russia","Moscow");
        var iterator= countries.entrySet().iterator();
        while(iterator.hasNext()) {
            var capital =iterator.next();
            System.out.println(capital.getValue()+" is the capital of "+capital.getKey());
        }
        System.out.println("*********************");
        for(var country:countries.entrySet()) {
            System.out.println(country.getKey());
            System.out.println(country.getValue());

        }
        System.out.println("****************");

       countries.forEach((key,value) -> {
           System.out.println(value);

        });









    }
}
