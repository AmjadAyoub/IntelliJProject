package class14;

import java.util.Arrays;

public class StringRecap {
    public static void main(String[] args) {

        String str = "jfhfjhfjhsjfhsDFGHGFGH1235821054@#$%^&*";
        str.replaceAll("[^a-z]", "");
        System.out.println("str = " + str);  // no change in outcome because String is immutable

        str = str.replaceAll("[^a-z]", "");
        System.out.println("str = " + str);  // // all special characters gone because variable is reassigned

        String sentence = "Batch 14 is Great. Batch 14 is excellent? Batch 14 is just amazing";
        String[] split = sentence.split("[.?!]");
        System.out.println("split = " + Arrays.toString(split));

        String str2 = " Batch 14 is Great.Batch 14 is Great";
        String replace = str2.replaceFirst("Great", "Good");
        System.out.println(replace); // will replace only the first great to good but not the second one

    }

}
