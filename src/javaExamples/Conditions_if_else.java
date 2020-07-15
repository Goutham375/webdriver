package javaExamples;

import java.util.Scanner;

public class Conditions_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner val = new Scanner(System.in);
			System.out.println("Enter the value of i");
			int i= val.nextInt();
			
			if(i<=10) {
				System.out.println("Entered i value is less than equal to 10"+ " " + "i.e" + " " +i);
				
			}
			else
				System.out.println("Entered value is greater than 10" + " " + "i.e" + " " +i);
	}//void main

}//class

/*OUTPUT:
Enter the value of i
6
Entered i value is less than equal to 10 i.e 6

 */

