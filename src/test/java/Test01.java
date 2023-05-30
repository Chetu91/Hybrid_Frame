

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Test01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
        File file =    new File("./TestData/TestData.xlsx");
        
        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);
        
        //creating workbook instance that refers to .xls file
        HSSFWorkbook wb=new HSSFWorkbook(inputStream);
        
        //creating a Sheet object using the sheet Name
        HSSFSheet sheet=wb.getSheet("STUDENT_DATA");
        
        //Create a row object to retrieve row at index 3
        HSSFRow row2=sheet.createRow(3);
        
        //create a cell object to enter value in it using cell Index
        row2.createCell(0).setCellValue("Diana");

        
        //write the data in excel using output stream
        FileOutputStream outputStream = new FileOutputStream("./TestData/TestData.xlsx");
        wb.write(outputStream);

	}

}
