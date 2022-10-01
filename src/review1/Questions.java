package review1;

public class Questions {
    public static void main(String[] args) {
        // how would you reverse a string without using reverse function ?

        /*  1. use StringBuilder and reverse method
            2. use chatAt();
            3. use tocharArray();  HW
         */

        String str="hello";
        String newString = "";
        for(int i=str.length()-1;i>=0; i--) {
            newString=newString+str.charAt(i);

        }
        System.out.print(newString);  // olleh

        String s="Class is almost over";
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);

       // to use upper or lower case in Stringbuilder and stringbuffer we have to do it like this:

        StringBuffer str1=new StringBuffer("Hello");
        StringBuffer str2=new StringBuffer("World");

        System.out.print(str1.toString().toUpperCase());






    }
}
