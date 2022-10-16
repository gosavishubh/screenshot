package excel;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

//import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo 
{
public static void main(String[] args) throws IOException
{
	File src = new  File("C:\\Users\\Shubhu\\Desktop\\sheet1.xlsx");
	
	FileInputStream fs= new FileInputStream(src);
	
	XSSFWorkbook wb=new XSSFWorkbook(fs);//XSSFWorkbook method of this class is use to read & write data from mirosoft excel
											//and open office xml file into.xls or .xlsx
	
	XSSFSheet sh1= wb.getSheet("sheet1");// representing a sheet of this interface
	
	String value= sh1.getRow(1).getCell(0).getStringCellValue();
	
	System.out.println(value);
	
	DataFormatter df=new DataFormatter();
	
	String numericstringvalue=df.formatCellValue(sh1.getRow(1).getCell(1));
	
	System.out.println(numericstringvalue);
	
}
}