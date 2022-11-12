package Replits;

import java.util.LinkedList;

public class Replit192 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        int count = 0;

        for (int i = 2; i < 100; i++) {

            for (int j = 1; j < i+1; j++) {
                if (i % j == 0)
                    count++;

                }
                if (count == 2)
                    numbers.add(i);

                count = 0;

            }
        System.out.println(numbers);

        }

    }


