package javaExamples;

import java.util.Scanner;

public class Condition_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner val = new Scanner(System.in);
		System.out.println("Enter the value of i");
		int i= val.nextInt();

		if(i<=10) {
			System.out.println("Entered i value is less than equal to 10"+ " " + "i.e" + " " +i);
			
		}//if
	}//void main
}// class

/*Output
Enter the value of i
5
Entered i value is less than equal to 10 i.e 5

 */
