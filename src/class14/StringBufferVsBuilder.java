package class14;

public class StringBufferVsBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("Today is java class"); // mostly used class, newer, faster
        StringBuffer stringBuffer=new StringBuffer("Today is java class"); // older one, slow and not used mostly
        
        // to convert from string to stringBuilder
        String str="Java is very easy";
        StringBuilder stringBuilder1=new StringBuilder(str);
        System.out.println("stringBuilder1 = " + stringBuilder1);

        // to convert from stringbuilder to string
        String newStr=stringBuilder1.toString();
        
        

        
        
        
        
        
        
    }
}
