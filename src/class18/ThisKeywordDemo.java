package class18;

public class ThisKeywordDemo {
    String str="Red";

    void print(){
        String str="Blue";

        System.out.println(this.str);  // will print instance variable because using this. keyword
        System.out.println(str);  // will print local variable
    }

    public static void main(String[] args) {
        new ThisKeywordDemo().print();
    }
}
