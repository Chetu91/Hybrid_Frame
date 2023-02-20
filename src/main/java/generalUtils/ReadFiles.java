package generalUtils;

import java.io.FileInputStream;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.simple.parser.JSONParser;

public class ReadFiles {

	
	public String readJsonFile(String key) throws Throwable {
		
		FileReader file=new FileReader(Autoconstant.jfilepath);
		
		JSONParser jparse=new JSONParser();
	       Object obj = jparse.parse(file);
	       
	       HashMap hm=(HashMap)obj; //downcasting
	       String jfile = hm.get(key).toString();
		   return jfile;

		}
		
		public String readExcelFile(String sheet,int row,int cell) throws Throwable {
			
			FileInputStream file=new FileInputStream(Autoconstant.excelpath);
			Workbook wb = WorkbookFactory.create(file);
			String efile = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
			return efile;
		}
		
		public String readPropertyFile(String key) throws Throwable {
			
			FileInputStream file=new FileInputStream(Autoconstant.pfilepath);
			Properties p=new Properties();
		    p.load(file);
		   String pfile = p.getProperty(key);
		   return pfile;
		}
}
