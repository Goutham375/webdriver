package webdriverExamples;

import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;

public class Excel_ReadDataSinglerow {

	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("D:\\Goutham's folder\\MagneQ_software_testing_course\\Exceldata\\ReadExcel.xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet s1 = wb.getSheet("Sheet1");
		System.out.println("sheet name is " + s1.getName());
		//read data from specific row and colomn
		String spc = s1.getCell(2, 1).getContents();
		System.out.println("Data from 2nd colomn 1 st row is " + spc);
		//read data from one perticular row i.e 
		System.out.println("Details of Rajesh");
		for(int i= 0; i<=s1.getRows()-1;i++) {
			String s =s1.getCell(i, 2).getContents();
			System.out.println(s);
		}//for

		//readinf all the rows in exccel file				
	}//void main
}//class

/*
OUTPUT
sheet name is Sheet1
Data from 2nd colomn 1 st row is suresh@gmail.com
Details of Rajesh
102
rajesh
rajesh@gmail.com
97845745874
*/
