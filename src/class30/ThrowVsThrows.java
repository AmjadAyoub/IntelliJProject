package class30;

import utils.ExcelReader;

public class ThrowVsThrows {
    public static void main(String[] args)  {
        method2();
    }


    public static void method1()  {
      try{
          System.out.println(ExcelReader.read("/Users/apple/IdeaProjects/SDETBatch14Java/Data/Test.xlsx"));
      } catch(Exception e){
          System.out.println("Send an email to user that his code is unable to locate the file");
      }


    }
    public static void method2()  {
        method1();
    }
}

// throw method will not solve the issue, but it will throw the issue to the next who will use this method and will keep throwing the error to the next till
// a user add try/catch block to be taken care of.