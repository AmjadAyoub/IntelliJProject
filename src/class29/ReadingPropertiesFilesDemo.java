package class29;

import utils.ConfigReader;
import utils.ExcelReader;

import java.io.IOException;

public class ReadingPropertiesFilesDemo {
    public static void main(String[] args) throws IOException {

        // calling ConfiqReader properties method to read data from properties
        String path="Data/config.properties";
        var properties= ConfigReader.read(path);
        System.out.println(properties.getProperty("browser"));
        System.out.println(properties.getProperty("URl"));

      // calling read method from Excelreader class to read excel file
        String excelPath="Data/Test.xlsx";
        var excelData= ExcelReader.read(excelPath);
        System.out.println(excelData);
    }
}
