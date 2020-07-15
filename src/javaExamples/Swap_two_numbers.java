package javaExamples;

import java.util.Scanner;

public class Swap_two_numbers {

	public static void main(String[] args) {
		int a,b,temp;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the value of a and b");
		a= obj.nextInt();
		b= obj.nextInt();
		System.out.println("values of a and b before swaping are " + "a = " + a + " " + "b = " + b);
		temp= a;
		a=b;
		b=temp;
		System.out.println("values of a and b after swaping are " + "a = " + a + " " + "b = " + b);
	}//void main
}//class

/*OUTPUT
enter the value of a and b
9
84
values of a and b before swaping are a = 9 b = 84
values of a and b after swaping are a = 84 b = 9
*/