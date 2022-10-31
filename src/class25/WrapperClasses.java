package class25;

import java.util.ArrayList;

public class WrapperClasses {
    public static void main(String[] args) {
        int num=10;
      // boxing or manual conversion from primitive to wrapper type
      //Integer wrappedNum=Integer.valueOf(num);
      //AutoBoxing or automatic conversion of a primitive to a wrapper type
         Integer number=num;
        System.out.println(number);
        Integer wrappedNum=num;
        System.out.println(wrappedNum);
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        //unboxing converting a wrapper type to a corresponding primitive type
      //  int num2= wrappedNum.intValue();
        //auto unboxing or automatic conversion of a wrapper type to a primitive type
        int num2=wrappedNum;




    }
}
