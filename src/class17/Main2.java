package class17;

public class Main2 {
    static String surround(String s, String search_term) {

        String str=s.replaceAll(search_term,"("+search_term+")");



        return str;
    }

    public static void main(String[] args){
        System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
        System.out.println(surround("technology","o")); //"techn(o)l(o)gy"
    }
}
