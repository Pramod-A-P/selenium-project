package com.herokuapp.theinternet;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataSupplier {
	
	@Test
	@DataProvider
	public String[][]   getData() throws Exception{
File excelFile=new File("./src/test/resources/Test.xlsx");
System.out.println(excelFile.exists()); //To Check whether the Excel Sheet is Existing or not


//To Read the Raw Data
FileInputStream fis =new FileInputStream(excelFile);


//To convert Raw data into Excel workbook format[xls-->H,,,xlsx-->X]
XSSFWorkbook workbook=new XSSFWorkbook(fis);


//To Add Sheet of Excel Workbook
XSSFSheet sheet=workbook.getSheet("Sheet1");


//Method:1 To get the Rows[.getphysical -->gets physical  number of Rows in the workbook Including the Header Row
int noOfRows=sheet.getPhysicalNumberOfRows();
System.out.println(sheet.getPhysicalNumberOfRows());


//Method:2 To get the Rows[.getphysical -->gets physical  number of Rows in the workbook excluding the Header Row
//sheet.getLastRowNum();
//System.out.println(sheet.getLastRowNum());


//To get Number of Columns  ,,,,.getRow(index number of 1st Row),,,,.getLastCellNum(index of last cell Number ) 
int noOfColumns=sheet.getRow(0).getLastCellNum();
String[][] data = new String[noOfRows-1][noOfColumns]; // To create two dimensional array


//Loop to iterate Number of Rows
for (int i=1;i<noOfRows-1;i++) {//i=1;==>excluding Header Row
	
	//data = new String[noOfRows-1][noOfColumns];//creating 2 dimensional array,,specifying how many number rows you want and how many number of columns you in each row,,
	
	
	//Loop to iterate Number of Columns
	for (int j=0;j<noOfColumns;j++) {
		DataFormatter df=new DataFormatter();//Convert all type of data into normal String Type
	data[i][j]=	df.formatCellValue(sheet.getRow(i+1).getCell(j));  //To Read Value from the Excel Sheet,[df.formatCellValue=specify which cell value we have to format actually,,

	//	System.out.println(	sheet.getRow(i).getCell(j).getStringCellValue());
	
	}
	
}




//To close the connection of Workbook or else there will loss of the data
workbook.close();
fis.close();



	

return data;

}
}