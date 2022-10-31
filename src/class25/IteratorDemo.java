package class25;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
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
        //get the iterator from the list
        Iterator<String> iterator =beautyProducts.iterator();
     /*   System.out.println(iterator.hasNext()); //true :  we have one item... if we comment out all elements except the first one "Blush"
        System.out.println(iterator.next()); //it gives us the item and also removes the items from iterator
        System.out.println(iterator.hasNext());  // false
        iterator.next();
        iterator.next();
        System.out.println(iterator.next()); // error because we have only one element  */


        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
