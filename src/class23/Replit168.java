package class23;

public class Replit168 {
    final String print(String word) {
       for(int i=word.length()-1; i>=0; i--) {
           System.out.print(word.charAt(i));
        }


        return"";
    }

    public static void main(String[] args) {
        Replit168 obj= new Replit168();
        obj.print("hello");
    }

}
