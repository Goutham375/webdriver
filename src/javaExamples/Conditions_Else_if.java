package javaExamples;

import java.util.Scanner;

public class Conditions_Else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner val = new Scanner(System.in);
		System.out.println("enter the value of i");
		
		int i= val.nextInt();
		
		if(i<9)
		{
			System.out.println("entered value is less than 9" + " " + "i.e"+ " " + i);
		}
		else if(i==9) 
		
			System.out.println("entered value is equal to 9" +  " " + "i.e"+ " " + i);
			else 
				System.out.println("entered I value is greater then 9 " + " " + "i.e" + " " + i );
	}//void main
}//class

/*OUPUT:
enter the value of i
4
entered value is less than 9 i.e 4

 */
