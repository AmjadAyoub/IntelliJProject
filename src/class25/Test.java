package class25;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);

        for(int i=1;i<=5;i++){
           num.add(scanner.nextInt());

        }
        System.out.println(num);

      //  System.out.println(num.toString().replace("[","").replace("]","").replace(",",""));




    }
}
