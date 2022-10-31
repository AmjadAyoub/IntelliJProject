package class25;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<String> makeUpItem= new ArrayList<>();
        makeUpItem.add("Blush");
        makeUpItem.add("Base");
        makeUpItem.add("Concealer");
        makeUpItem.add("Mascara");
        makeUpItem.add("Eyeliner");
        makeUpItem.add("Lipstick");

        ArrayList<String> cosmetics = new ArrayList<>();
        cosmetics.add("Dove soap");
        cosmetics.add("Conditioner");
        cosmetics.add("Shampoo");
        cosmetics.add("Lotion");

        ArrayList<String> beautyProducts=new ArrayList<>();
        // adds everything from makeUpItems to beautyProducts
        beautyProducts.addAll(makeUpItem);
        beautyProducts.addAll(cosmetics);
        System.out.println(beautyProducts);
        beautyProducts.remove("Lotion");
        System.out.println(beautyProducts);
        beautyProducts.removeAll(cosmetics);
        System.out.println(beautyProducts);
        beautyProducts.clear(); // removes everything
        System.out.println(beautyProducts); // []




    }
}
