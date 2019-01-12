package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils
{
	public static XSSFWorkbook workBook = null;
	public static XSSFSheet workSheet = null;
	public static XSSFRow Row = null;
	public static XSSFCell Cell = null;
	public static int rowLen = 0;
	public static int colLen = 0;
	
	public static void setExcel(String excelPath, String sheetName) throws IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		
		workBook = new XSSFWorkbook(fis);
		
		workSheet = workBook.getSheet(sheetName);
	}
	
	public static String getCellData(int row, int col)
	{
		rowLen = workSheet.getPhysicalNumberOfRows();
		
		Row = workSheet.getRow(row);
		
		Cell = Row.getCell(col);
		
		
		
		return Cell.getStringCellValue();
	}
}
