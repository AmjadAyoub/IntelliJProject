package class28;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {

    //  String path="Data/config.properties" ;   // location of the file

        //we can use var instead of String
     var path="Data/config.properties" ;  // location of the file
     var fileInputStream=new FileInputStream(path); // helps us Navigating to the file
     var properties=new Properties();  // that special software which helps us read data from that file
     properties.load(fileInputStream); // loads all the data from the file inside (memory)
        System.out.println(properties);
        System.out.println(properties.getProperty("URl"));
        System.out.println(properties.getProperty("password"));
        fileInputStream.close();  // closes the file



    }
}
