package webdriverExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteData {


	//private static XSSFWorkbook XSSFWorkbook wb;

	public static void main(String[] args) throws IOException  {
		String FilePath = "D:\\Goutham's folder\\MagneQ_software_testing_course\\Exceldata\\datar.xlsx";
		FileInputStream file = new FileInputStream(FilePath);
		XSSFWorkbook wb = new XSSFWorkbook(file);

		// TO get the access to the sheet
		XSSFSheet sheet = wb.getSheet("Sheet1");
		System.out.println(sheet.getSheetName());
		//write data in a cell
		XSSFCell cell = sheet.getRow(4).getCell(5);
		cell.setCellValue("Goutham");
		file.close();
		FileOutputStream fileout = new FileOutputStream("D:\\\\Goutham's folder\\\\MagneQ_software_testing_course\\\\Exceldata\\\\datar.xlsx");
		wb.write(fileout);
		System.out.println("Updated data is: " + cell.getStringCellValue());
		fileout.close();
		
	}//voidmain
}//class
