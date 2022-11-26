package class30;

import utils.ExcelReader;

public class TypesOfExceptions {
    public static void main(String[] args) {
        String name=null;
        if(name!=null) {
            System.out.println(name.length()); // here no need to use try-catch block to avoid exception error
        }

        int [] arr=new int[5];
        int index=10;
        try{
            System.out.println(arr[index]);
        } catch (Exception e) {
            System.out.println("Please fix your issues");
        }

        // or we can use if condition instead of try-catch block
        if(index<arr.length) {
            System.out.println(arr[index]);
        }

        // if you are dealing with problems that you do not have control on like connection issue, then oyu have to use try-catch block

        try {
            System.out.println(ExcelReader.read("/Users/apple/IdeaProjects/SDETBatch14Java/Data/Test.xlsx"));
        } catch (NullPointerException e){

        } catch (Exception e) {
            System.out.println("Backup code");
        }
        System.out.println("important line of code");


    }
}
