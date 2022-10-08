package class17;
  // print the number of objects created
class Test {
    static int count;

    public Test(){
        count++;


    }


    public static void main(String[] args) {

        Test obj1 = new Test();
        Test obj2 = new Test();
        Test obj3 = new Test();

        System.out.println(Test.count);

    }

}


















