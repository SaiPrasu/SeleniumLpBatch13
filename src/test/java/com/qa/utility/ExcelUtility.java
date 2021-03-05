package com.qa.utility;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	XSSFWorkbook workBook;
	XSSFSheet sheet;
	
	public ExcelUtility(String excelPath, String sheetName) {
		try {
			workBook=new XSSFWorkbook(excelPath);
			sheet=workBook.getSheet(sheetName);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public int getRowCount() {
		int rowCount=sheet.getPhysicalNumberOfRows();
		return rowCount;
	}
	
	public int getCellCount() {
		int cellCount=sheet.getRow(0).getPhysicalNumberOfCells();
		return cellCount;	
	}	
	
	public String getCelData(int rowNum, int colNum) {
		String stringCellValues=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		return stringCellValues;
	}	
}