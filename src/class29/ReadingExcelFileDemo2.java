package class29;
import utils.ExcelReader;
import java.io.IOException;

public class ReadingExcelFileDemo2 {
    public static void main(String[] args) throws IOException {


        // calling read method in ExcelReader class. since it is static, we call it by class name, no need to crete an object
        // ExcelReader.read(write the excel file path here)
        var excelData=   ExcelReader.read("Data/Test.xlsx");
        System.out.println(excelData);

    }
}
