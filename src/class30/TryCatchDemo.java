package class30;

public class TryCatchDemo {
    public static void main(String[] args) {
        try{
            doSomething();
        } catch(NullPointerException npe){
            System.out.println("Got null pointer exception");
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println("Got Index out of bound this time");
        }
        catch(NegativeArraySizeException e){
            System.out.println("Got wrong array size ");
        }
        catch(ArithmeticException e){
            System.out.println("This operation is not supported in Math");
        }

        // this exception class can handle all errors if none of the above exception classes work. Called generic exception class
        catch(Exception e) {
            System.out.println(" I can handle any type of exceptions");
        }

    }

    public static void doSomething(){
   /*     String name=null;
        System.out.println(name.length());   //Got null pointer exception

        int arr[]=new int[1];
        System.out.println(arr[10]);  */
    /*    String str="dsfnksd";
        str.charAt(20);  */

        System.out.println(101/0);  // This operation is not supported in Math
    }
}
