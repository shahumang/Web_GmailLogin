package util;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
    private static XSSFSheet ExcelWSheet;
    private static XSSFWorkbook ExcelWBook;
    private static XSSFCell Cell;
    private static XSSFRow Row;
   
    
    public static void setExcelFile(String Path, String SheetName) throws Exception                
    {
    	try 
    	{
    		FileInputStream ExcelFile = new FileInputStream(Path);
		    ExcelWBook = new XSSFWorkbook(ExcelFile);
		    ExcelWSheet = ExcelWBook.getSheet(SheetName);
    	} 
    	catch (Exception e) 
    	{
    		throw (e);
    	}
    }
   public static String getCellData(int RowNum, int ColNum) throws Exception 
   {

	   try 
	   {
		   Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
		   String CellData = Cell.getStringCellValue();
		   return CellData;
	   }
	   catch (Exception e) 
	   {

		   return "";
	   }
   }
}