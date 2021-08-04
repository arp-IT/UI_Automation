package Util;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static String projectpath = System.getProperty("user.dir");
	static XSSFWorkbook woorkbook ;
	static XSSFSheet sheet ;
	
	public ExcelUtils(String excelpath, String sheetname) {
		try {
			woorkbook = new XSSFWorkbook(projectpath + excelpath);
			sheet = woorkbook.getSheet(sheetname);
		} 
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
		
	}

	public int getRowCount() {
		int rowCount = 0;
		try {
			rowCount = sheet.getPhysicalNumberOfRows();
		} 
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return rowCount;

	}
	
	public int getColCount() {
		int colCount = 0 ;
		try {
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		} 
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return colCount;

	}

	public String getCellData(int rowNum, int colNum) {
		String celldata = null;
		try {
			celldata = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		} 
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return celldata;

	}

}
