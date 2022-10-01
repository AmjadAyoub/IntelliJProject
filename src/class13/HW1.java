package class13;

public class HW1 {
    public static void main(String[] args) {
// Create a String that will hold a sentence. Write a program to get a new String without any spaces.
        String str="My name is Amjad";
        str=str.replaceAll("\\s",""); // or str=str.replaceAll(" ","");
        System.out.println(str);
        System.out.println("-------------");

        System.out.println(str.replaceAll("[ ]",""));


    }
}
