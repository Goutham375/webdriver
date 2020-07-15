package javaExamples;

import java.util.Scanner;

public class Switch_CalculatorProgram {

	public static void main(String[] args) {
		// This program performs arithmetic operation for 2 values(+,-,*/,%)
		int a,b;
		Scanner temp = new Scanner(System.in);
		System.out.println("Enter a value");
		a= temp.nextInt();
		System.out.println("Enter b value");
		b=temp.nextInt();
		System.out.println("Enter the symbol of operation you want to perform");
		char operaotor = temp.next().charAt(0);// reads the operator symbol which we define in the cases below
		// syntax to read a char is Scannerobj.next().charAt(index);
		switch(operaotor)
		{
		case '+':
		System.out.println("addition of a and b is " + ":" + a+b);
		break;
		case '-':
		int d=a-b;	
		System.out.println("Difference of a and b is " + ":" + d);
		break;
		case '*':
		System.out.println("mul of a and b is " + a*b);
		break;
		case '/':
		float e= a/b;
		System.out.println("division of a and b is " + ":" + e);
		break;
		case '%':
		double f = a%b;
		System.out.println("percentile of a and b is " + ":" + f);
		break;
		default:
			System.out.println("invalid arthametic entered");
		}//switch
	}// main 
}

/*
 *OUTPUT:
Enter a value
545623
Enter b value
554
Enter the symbol of operation you want to perform
/
division of a and b is :984.8790613718412
*/

