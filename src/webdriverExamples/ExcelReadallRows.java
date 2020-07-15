package webdriverExamples;

import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;

public class ExcelReadallRows {

	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("D:\\Goutham's folder\\MagneQ_software_testing_course\\Exceldata\\ReadExcel.xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet s1 = wb.getSheet("Sheet1");
		System.out.println("sheet name is " + s1.getName());
		System.out.println("Reading data from all the rows");
		for(int j= 0; j<=s1.getRows()-1;j++) {
			String empid = s1.getCell(0,j).getContents();
			String empnam = s1.getCell(1,j).getContents();
			String email = s1.getCell(2,j).getContents();
			String empno = s1.getCell(3,j).getContents();
			System.out.println(empid);
			System.out.println(empnam);
			System.out.println(email);
			System.out.println(empno);
			System.out.println();
		}//for
	}//void main
}//class

/*OUTPUT
sheet name is Sheet1
Reading data from all the rows
EmpID
EmpName
EmpEmail
EmpNo

101
Suresh
suresh@gmail.com
958247548

102
rajesh
rajesh@gmail.com
97845745874

103
hari
Hari@gmail.com
97845745874

*/