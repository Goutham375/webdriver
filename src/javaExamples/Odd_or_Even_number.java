package javaExamples;

import java.util.Scanner;

public class Odd_or_Even_number {

	public static void main(String[] args) {
		Scanner temp = new Scanner(System.in);
		System.out.println("enter an integet to find its even or odd number.");
		int num= temp.nextInt();
		if(num%2==0) {
			System.out.println(num + " is an even number");
		}
		else
		{
			System.out.println(num + " is an odd number.");
		}
	}//void main
}//class

/*OUTPUT
Daily I will practice selenium for 4 hours. 
Daily I will sleep only for 6 hours
Daily I will wake up at 6 clock
*/