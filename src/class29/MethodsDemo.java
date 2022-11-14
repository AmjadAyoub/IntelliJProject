package class29;

import class27.Dog;
import utils.ExcelReader;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class MethodsDemo {
    public static Dog returnDog(){
        return new Dog("Fuff", "green", "german"); // calling the object of Dog from Dog class
    }

  public static Map<String,String> getMap(){
        Map<String,String> map=new LinkedHashMap<>();
        map.put("Apple","Mango");

        return map;
    }

    public static void main(String[] args) throws IOException {
        Dog dog=returnDog();
        System.out.println(dog);

      //  System.out.println(getMap());

      var data= ExcelReader.read("Data/Test.xlsx");
        System.out.println(data.get(0));
        System.out.println(data.get(1));

      //  LinkedHashMap<String,String> map=data.get(2); we can use this instead of line33 if in ExcelReader class in utils used linkedhashmap
        Map<String,String> map=data.get(2);
        System.out.println(map.get("Age"));
    }
}
