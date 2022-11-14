package class28;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW7 {
    /*Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers   */
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>(Arrays.asList(20,50,20,33,9,45));
        var sum=0;
        for(var total:numbers) {
            sum+=total;
        }
        System.out.println(sum);


    }
}
