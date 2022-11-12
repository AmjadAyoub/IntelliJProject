package Replits;

import java.util.LinkedList;

public class Replit193 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(111);
        numbers.add(222);
        numbers.add(333);
        numbers.add(444);
        numbers.add(555);
        numbers.add(666);

     int sum=0;
     for(int num:numbers) {
         sum+=num;
     }

        System.out.println("Result of sum is "+sum);

    }
}
