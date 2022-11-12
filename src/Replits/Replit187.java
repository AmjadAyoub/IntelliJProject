package Replits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

// print yo yolo

public class Replit187 {
    public static void main(String[] args) {
        ArrayList<String> objects=new ArrayList<>(Arrays.asList("hi","yo","sup","yolo","boop"));

        Iterator<String> iterator=objects.iterator();
        while(iterator.hasNext()) {
            String obj=iterator.next();
          if(obj.contains("y")) {
              System.out.print(obj);
              System.out.print(" ");
          }

        }




        }



        }





