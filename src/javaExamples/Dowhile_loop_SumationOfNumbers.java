package javaExamples;

import java.util.Scanner;

public class Dowhile_loop_SumationOfNumbers {
	
	public static void main(String[] args) {
		
		Double number, sum = 0.0;     //program to perform sumation of numbers until user enters 0
        // creates an object of Scanner class
        Scanner input = new Scanner(System.in);

        do {

            // takes input from the user
            System.out.print("Enter a number: ");
            number = input.nextDouble();
            sum =sum+ number;
        } while (number != 0.0);  // test expression
	   
        System.out.println("Sum = " + sum);
    }//void main
	
}//class

/*
Enter a number: 5
Enter a number: 9
Enter a number: 0
Sum = 14.0
*/
