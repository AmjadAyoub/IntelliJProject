package class17;

public class Main2 {
    static String surround(String s, String search_term) {

        for (int i=0; i<s.length(); i++) {
            char[] charArray=s.toCharArray();
            if(s.toCharArray().equals (search_term)) {

                System.out.print("A"+s.charAt(i)+"A");

            } else {
                System.out.print(s.charAt(i));

                }


            }


        return "";
    }



    public static void main(String[] args){
        System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
        System.out.println(surround("technology","o")); //"techn(o)l(o)gy"
    }
}
