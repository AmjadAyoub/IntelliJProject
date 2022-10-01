package class13;

import java.util.Arrays;

public class HW4 {
    public static void main(String[] args) {
// How would you reverse a String word by word? for example
//        // input=>This is sentence i want to reverse
//        // output=>sihT si ecnetnes i tnaw ot esrever
 // String str="This is sentence i want to reverse";
 // String [] str1= str.split(" ");

 // for(int i=0; i<str1.length; i++) {

    //  for(int j=str1[i].length()-1; j>=0; j--) {
//
    //  }
    //  System.out.print(" ");
 // }

      //  System.out.println("----------------");  // different way

        StringBuilder strB=new StringBuilder("This is the sentence I want to reverse");
        strB.reverse();//wrong way
        System.out.println(strB);

        String str="This is sentence I want to reverse";
        String[] arr=str.split(" ");
        StringBuilder st=new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            String word=arr[i];
            StringBuilder stringBuilder=new StringBuilder(word);
            stringBuilder.reverse();
            arr[i]= stringBuilder.toString();
            st.append(arr[i]).append(" ");
        }
        System.out.println(st);




  }


    }

