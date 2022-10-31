package class25;

import java.util.ArrayList;
import java.util.Arrays;

public class HW1OtherWay {
    public static void main(String[] args) {
        var words = new ArrayList<String>(Arrays.asList("bike","car","boat","bee","eye","sky"));
        words.removeIf(x ->x.endsWith("e"));
        System.out.println(words);




    }
}
