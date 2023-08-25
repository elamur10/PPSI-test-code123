package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils( String excelpath, String sheetname)
	{

		try{
		
				
		workbook=new XSSFWorkbook(excelpath);
		sheet=workbook.getSheet(sheetname);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		getRowCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);
		
	}
		
		public static int getRowCount()
		{
			int rowcount=0;
			try{
				
				rowcount=sheet.getPhysicalNumberOfRows();
				//System.out.println("No of rows"+rowcount);
				
			}
			catch (Exception exp)
			{
				System.out.println(exp.getMessage());
				exp.getCause();
				exp.printStackTrace();
			}
			return rowcount;
		}
		
		public static int getColCount()
		{
			int colcount=0;
			try{
				
				colcount=sheet.getRow(0).getPhysicalNumberOfCells();
				//System.out.println("No of column"+colcount);
				
			}
			catch (Exception exp)
			{
				System.out.println(exp.getMessage());
				exp.getCause();
				exp.printStackTrace();
			}
			return colcount;
		}
		
		public static String getCellDataString(int rownum, int colnum)
		{
			String celldata=null;
          try{
		
				celldata=sheet.getRow(rownum).getCell(colnum).getStringCellValue();
				//System.out.println(celldata);
				
			}
			catch (Exception exp)
			{
				System.out.println(exp.getMessage());
				exp.getCause();
				exp.printStackTrace();
			}
          return celldata;
		}
		
		
		
		
		public static void getCellDataNumber(int rownum, int colnum)
		{
          try{
			
				String celldata=sheet.getRow(rownum).getCell(colnum).getStringCellValue();
				//System.out.println(celldata);
				
			}
			catch (Exception exp)
			{
				System.out.println(exp.getMessage());
				exp.getCause();
				exp.printStackTrace();
			}
		}
		
		
		
	}
	
	

