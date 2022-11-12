package class27;

import java.util.LinkedHashMap;

public class MapDemo2 {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> beautyProducts = new LinkedHashMap<>();
        beautyProducts.put("Foundation",5.5);
        beautyProducts.put("Blush",20.0);
        beautyProducts.put("Lipstick",10.5);

        LinkedHashMap<String,Double> cosmetics=new LinkedHashMap<>();
        cosmetics.put("Soap",10.2);
        cosmetics.put("Conditioner",20.5);
        cosmetics.put("Shampoo",30.99);

       LinkedHashMap<String,Double> grocery=new LinkedHashMap<>();
               grocery.putAll(beautyProducts); // adding beauty products to grocery
        System.out.println(grocery);
        grocery.putAll(cosmetics); // adding cosmetics to grocery
        System.out.println(grocery);

        grocery.clear();
        System.out.println(grocery);



    }
}
