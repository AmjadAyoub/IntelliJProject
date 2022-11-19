package review7;

import java.util.HashMap;
import java.util.Map;

public class InterviewQuestion {
    // create a method that returns a map of characters and their count in a String

    public static void main(String[] args) {
        String str="bdfjhdfbewqbcnsdfsdf";

        System.out.println(getcount(str));
    }

    public static Map<Character,Integer> getcount(String str) {
        char[] charArr = str.toCharArray();
        Map<Character,Integer> map= new HashMap<>();
        for(char c:charArr) {
            if(map.get(c) == null) {
                map.put(c,1);
            } else {
                int count=map.get(c);
                count=count+1;
                map.put(c,count);
            }

        }
        return map;
    }
}
