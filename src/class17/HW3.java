package class17;

public class HW3 {
    //Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    //Method should be available inside the class only where it was declared and executed by calling it is name.

     private static String getVowels(String str) {
    String newStr=str.replaceAll("[^aeiouAEIOU]","");
    return newStr;
    // return str.replaceAll("[^aeiouAEIOU]","");
     }

    public static void main(String[] args) {
        System.out.println(getVowels("Amjad"));
    }

}
    /*Note:
       If we are inside the same class we can call a method inside another by just writing its name. But we need
        to take care that these methods are both either static or non-static.

     */