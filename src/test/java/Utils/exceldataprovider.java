package Utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class exceldataprovider {
	
	
	
	
	@DataProvider(name="testdata1")
   public  Object[][] getdata()
  
     {
       String excelpath="C:\\Users\\ELMUR10\\eclipse-workspace\\PageObject\\testdata\\data.xlsx";
		Object data[][]=testdata(excelpath,"data");
		return data;
     }
		

	public static Object[][] testdata(String excelpath, String sheetname)
	{
		ExcelUtils excel=new ExcelUtils(excelpath,sheetname);
		int rowcount=excel.getRowCount();
		int colcount=excel.getColCount();
		
		Object data[][]=new Object[rowcount-1][colcount];
		
		for(int i=1;i<rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				String celldata=excel.getCellDataString(i, j);
				data[i-1][j]=celldata;
				
			}
		}
		return data;
	}
}
