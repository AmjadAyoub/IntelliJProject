package Replits;

import java.util.Iterator;
import java.util.LinkedList;

public class Replit190 {
    public static void main(String[] args) {

        LinkedList<Integer> num = new LinkedList<>();
        int previous = 0;
        int currentNumber = 1;
        int nextNum = 0;
        num.add(previous);
        num.add(currentNumber);
        for (int i = 0; i < 8; i++) {
            nextNum = previous + currentNumber;

            num.add(nextNum);

            previous = currentNumber;
            currentNumber = nextNum;
        }
        Iterator<Integer> number = num.iterator();
        while (number.hasNext()) {
            System.out.print(number.next() + " ");
        }

    }

    }


