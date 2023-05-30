package com.herokuapp.theinternet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataSupplier2 {

	public static void main(String[] args) throws IOException {
		{

			// Excel--->work books-->sheets----->rows--->cells
			// FileInputStream --->XSSFWorkbook--->XSSFSheet--->XSSFRow----->XSSFCell
			// FileInputStream classes enables to read the excel sheet to read mode
			// WriteInputStream classes enables to write the data into the excel sheet

			FileInputStream file = new FileInputStream("./src/test/resources/Test2.xlsx");

			XSSFWorkbook workbook = new XSSFWorkbook(file); // created workbook object

			XSSFSheet sheet = workbook.getSheet("Sheet2"); // created object for sheets,Sheet1 is Sheet Name ,,,
			// XSSFSheet sheet=workbook.getSheetAt(0); //Providing 1st sheet ,,(providing
			// index of excel sheet

			int noOfRows = sheet.getLastRowNum();// returns the row count
			int noOfCols = sheet.getRow(0).getLastCellNum(); // .getRow(0) ---->selects row at index 0 ,i.e 1st row,,
																// and .getLastCellNum() ---->gets last cell
																// number(which is column count)

			for (int row = 1; row <noOfRows; row++) {

				XSSFRow current_row = sheet.getRow(row); // focussed on current row
				String UserName=current_row.getCell(0).getStringCellValue();
				String Password=current_row.getCell(1).getStringCellValue();
				
				System.out.println("");
				System.out.println("");
				
				for (int j = 0; j <noOfCols; j++) {

					String value = current_row.getCell(j).toString();// read the value from a cell  and .toString() method reads all kind of data eg: boolean ,number ,string
					System.out.print(" "+value);// other methods,, .getStringCellValue()   .getNumericCellValue()   .getBooleanCellValue() 
					
				}
				System.out.println();
			}

		}
	}
}