package class24;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        // how to store chars in arrayList
       // ArrayList<Character> chars = new ArrayList<>(Arrays.asList('E','F'));
        ArrayList<Character> chars = new ArrayList<>();
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('Z');
        chars.add('G');
        System.out.println(chars);

        // how to store booleans in arrayList
        ArrayList<Boolean> booleans=new ArrayList<>();
        booleans.add(false);
        booleans.add(false);
        booleans.add(true);
        System.out.println(booleans);

        ArrayList<Float> floats= new ArrayList<>();
        floats.add(12.5f);
        floats.add(12f);
        System.out.println(floats);



    }
}
