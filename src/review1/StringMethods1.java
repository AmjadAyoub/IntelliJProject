package review1;

public class StringMethods1 {
    public static void main(String[] args) {
        String str = "hello";
        //toUpperCase or toLowerCase

        str.toUpperCase();
        System.out.println(str);  // hello  // because string class is immutable

        System.out.println("----------------");
        str = str.toUpperCase();
        System.out.println(str);  // HELLO

        //length() -> gives size
        int size=str.length();
        System.out.println(size);  // 5

        // charAt() -. Returns the char value at the specified index

        char letter=str.charAt(3);
        System.out.println(letter);  // l

         // how to get last character
        char lastCharacter= str.charAt(str.length()-1);
        System.out.println(lastCharacter);  // o

        // indexOf
        int index=str.indexOf(lastCharacter);
        System.out.println(index);  // 4
        System.out.println(str.indexOf('a'));  // -1    because there is no a in hello so it gives -1


        //isEmpty() - returns true if length is more than 0
        boolean empty=str.isEmpty();
        System.out.println(empty);   // false



    }
}
