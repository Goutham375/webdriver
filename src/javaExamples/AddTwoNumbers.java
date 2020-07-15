package javaExamples;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// Program to add 2 numbers
		int a, b;
		Scanner tempvar = new Scanner(System.in);
		System.out.println("enter the value of a");
		a=tempvar.nextInt();
		System.out.println("enter value of b");
		b= tempvar.nextInt();
		System.out.println("Addition of a and b is" + ":" + a+b);
	}//main

}//class

/*OUTPUT:
enter the value of a
256
enter value of b
15151
Addition of a and b is:25615151
*/