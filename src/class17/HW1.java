package class17;

public class HW1 {

    //Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    //Method should be visibly only within same package and accessible by the creating an instance of the class.

      int sumOfArray(int[]a) {
          int sum=0;
          for (int i=0; i<a.length; i++) {
               sum+=a[i];
               //  for (int num:a) enhanced loop
              // sum+=num;

          }

          return sum;
      }

    public static void main(String[] args) {
        HW1 print=new HW1();
        int[] a={1,8,15,89};
        System.out.println(print.sumOfArray(a));

    }
}
