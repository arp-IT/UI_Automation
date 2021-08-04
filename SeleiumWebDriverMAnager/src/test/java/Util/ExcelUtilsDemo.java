package Util;

public class ExcelUtilsDemo {

	public static void main(String[] args) {
		
		String excelpath = "/Excel/data.xlsx";
		String sheetname = "Sheet1";
		
		ExcelUtils excel = new ExcelUtils(excelpath,sheetname);
		excel.getRowCount();
		excel.getCellData(0, 0);
		

	}

}
