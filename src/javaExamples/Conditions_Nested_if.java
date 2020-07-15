package javaExamples;

import java.util.Scanner;

public class Conditions_Nested_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner val = new Scanner(System.in);
		System.out.println("enter the value of i");
		
		int i= val.nextInt();
		
		if(i<=10)
		{
			if(i==5) {
			
			System.out.println("entered value is the middle value in between 0 to 10 " + " " + "i.e"+ " " + i);
			}
		}
		else
			System.out.println("entered I value is greater then 9 " + " " + "i.e" + " " + i );

	}//void main
}//class

/*OUTPUT
enter the value of i
5
entered value is the middle value in between 0 to 10  i.e 5

 */
