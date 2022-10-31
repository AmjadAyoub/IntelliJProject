package class25;

import java.util.ArrayList;

public class GenericCollection {
    // Non generic way of using collections framework. you run in lot of problems at run time because java does not know the data typeyou are using in this class
    public static void main(String[] args) {


        ArrayList names = new ArrayList();
        names.add("Serhi");
        names.add(10);
        System.out.print(((String) names.get(0)).length());


    }
}
