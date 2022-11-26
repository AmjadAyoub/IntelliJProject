package Replits;

import java.util.Scanner;

public class Replit213 {
    public static void main(String[] args) {

    try{
        temperature();
    } catch(NullPointerException e){

    }


    }


    public static void temperature  (){
        Scanner scan = new Scanner(System.in);
        int temp= scan.nextInt();
        if(temp>=32) {
            System.out.println("The temperature is "+temp);
        } else {
            throw new RuntimeException("It is freezing");
        }
    }
}
