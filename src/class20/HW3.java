package class20;

 public class HW3 {
    //Create 1 class with a static method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.




    static void hW(String name, int number){
        System.out.println("1");
    }


    static void hW(String name,int number,int number2){
        System.out.println("2");
    }


    static void hW(int num1,int number){
        System.out.println("3");
    }


    public static void main(String[] args) {
        hW("Joe",45);
        hW("Mary",25,30);
        hW(23,24);

    }
}

