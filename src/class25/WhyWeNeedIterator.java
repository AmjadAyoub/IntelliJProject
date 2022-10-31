package class25;

import java.util.ArrayList;

public class WhyWeNeedIterator {
    public static void main(String[] args) {
        ArrayList<String> beautyProducts=new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("lipstick");
        beautyProducts.add("Dove Soap");
        beautyProducts.add("Conditioner");
        beautyProducts.add("Primer");
        beautyProducts.add("shampoo");
        beautyProducts.add("lotion");
        beautyProducts.add("concealer");
        beautyProducts.add("eyeLinear");
//11
        for (int i = 0; i < beautyProducts.size(); i++) {
            if(beautyProducts.get(i).endsWith("r")){
                beautyProducts.remove(i);
            }
        }
       /* for (String item:beautyProducts
             ) {
            if(item.endsWith("r")){
                beautyProducts.remove(item);
            }
        }*/
        System.out.println(beautyProducts);
    }

}
 // we cannot use loops in arraylist becaase it will change the size of the arraylist.
 // we should use Iterators