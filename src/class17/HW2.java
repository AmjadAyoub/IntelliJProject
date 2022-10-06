package class17;

public class HW2 {
    //Create a method that will take a String as a parameter and returns reversed String. Method should be available to all classes
    //within your project and accessible by class name.

       public static String reverse1 (String word) {
           StringBuilder stringBuilder=new StringBuilder(word);
           stringBuilder.reverse();
           String reversal=stringBuilder.toString();
           // return new StringBuilder(word).reverse().toString(); we can use this line instead of lines 8,9 & 10


           return reversal;
       }

    public static void main(String[] args) {
        HW2 print = new HW2 ();

        System.out.println(print.reverse1 ("welcome"));
    }
}
