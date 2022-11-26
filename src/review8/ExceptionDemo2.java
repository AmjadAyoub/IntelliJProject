package review8;

import utils.ExcelReader;

public class ExceptionDemo2 {
    public static void main(String[] args)  {

        try{
            ExcelReader.read("dkjbfkjdbf");}
        catch (Exception e){
            System.out.println("Please contact our support team at support@syntax.com");
        }

    }
}
