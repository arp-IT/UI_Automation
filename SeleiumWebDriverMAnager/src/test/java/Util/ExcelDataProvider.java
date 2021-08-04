package Util;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	static String excelpath = "/Excel/data.xlsx";
	static String sheetname = "Sheet1";
	
	@Test(dataProvider="test1data")
	public void test1(String UserName,String Password) {
		
		System.out.println(UserName);
		
	}
	
	@DataProvider(name = "test1data")
	public static Object getData() {
		
		Object data[][] = testData(excelpath,sheetname);
		return data;
		
	}
	
	public static  Object[][] testData(String excelpath, String sheetname) {
		
		ExcelUtils excel = new ExcelUtils(excelpath,sheetname);
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		Object data[][] = new Object[rowCount-1][colCount];
		
		
		for(int i = 1 ; i < rowCount ; i++) {
			
			for(int j = 0 ; j < colCount ; j++) {
				
				String cellData = excel.getCellData(i, j);
				data[i-1][j] = cellData ;
			}
			System.out.println();
		}
		return data;
	}

}
