package class24;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        System.out.println(colors);//Red, Green, Blue, Yellow, Black
        System.out.println(colors.get(0));  // Red
        System.out.println(colors.get(2));  // Blue
        System.out.println(colors.size());  // 5

        for(int i=0; i<colors.size() ; i++) {
            System.out.println(colors.get(i)); //Red, Green, Blue, Yellow, Black (using for loop)

        }
        System.out.println("*******************");
        for(String color:colors){
            System.out.println(color);  //Red, Green, Blue, Yellow, Black (using enhanced loop)
        }
    }
}
