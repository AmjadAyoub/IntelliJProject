package review1;

public class StringMethods2 {
    public static void main(String[] args) {

        String textFromApplication=" Enrol today ";
        String textFromUserStory="Enrol today";

        if(textFromApplication.trim().equals(textFromUserStory)) {
            System.out.println("Text is matched.Test Pass");
        }  else {
            System.out.println("Text is NOT matched.Test Failed");
        }

        // trim ()-  returns a string whose value is this string, without any spaces on right and left
        // whitespace is removed
        System.out.println(textFromApplication.trim());
        System.out.println(textFromApplication);

        //substring
        String str="Hello Class";
        String part2=str.substring(6);
        System.out.println(part2);  //Class

        String part1 =str.substring(0,5);
        System.out.println(part1);   // Hello

        // concat
        //String newString=part1.concat(part2);  HelloClass
        String newString=part1.concat(" ").concat(part2);  // Hello Class
        System.out.println(newString); // HelloClass
        System.out.println(part1+part2);  // HelloClass

      // some examples

        char single=newString.substring(6).charAt(0);
        System.out.println(single);  // C

        // newString.charAt(0).substring(6);   // compiler error because you cannot use methods with char

        // replace();
        String myString="Today is September";
        myString=myString.replace("September", "October");
        System.out.println(myString);  // Today is October

         myString=myString.replace('T', 't');
        System.out.println(myString);  // today is October

     //   myString.equalsIgnoreCase("Today is october").replace('i'),('a'); // error because equalsignorecase is boolean. we cannot use boolean with methods

        // split (); we use arrays with split method because split methods cuts the string into multiple strings
        String myStr="Today is a review class";
        String [] array=myStr.split(" ");
        System.out.println(array.length);  // 5
        System.out.println(array[3]); // review

        for(int i=0; i<array.length; i++) {
            System.out.print(array[i]+ " "); // Today is a review class
        }
        System.out.println(" ");
        // other way

        for(String arr:array) {
            System.out.print(arr+ " ");  // Today is a review class
        }






    }
}
