package class29;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingExcelFileDemo1 {
    public static void main(String[] args) throws IOException {

        // location of the file on your harddrive where file is stored
        String path="Data/Test.xlsx";
        // Reads the data from HardDrive brings it to RAM in the raw form 10101010101010
        // In simple words we can say computer has navigated to that file
        FileInputStream fis=new FileInputStream(path);
        // this class converts the raw bytes to Excel format or in simple words it is that special software
        // that helps us read and write data to an Excel file.
        XSSFWorkbook excel=new XSSFWorkbook(fis);
        Sheet sheet=excel.getSheet("Sheet1");
        int noOfRow=sheet.getPhysicalNumberOfRows();



        for(int i=0; i<noOfRow; i++){
            Row row=sheet.getRow(i);  // get a row from the sheet one by one through loop
          int noOfCell = row.getPhysicalNumberOfCells();
          for(int j=0; j<noOfCell; j++){
              System.out.print(row.getCell(j)+" ");
          }
          System.out.println();

        }


        }

    }

