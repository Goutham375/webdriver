package javaExamples;

import java.security.PublicKey;
import java.util.Scanner;

public class Methods_AllConditions {

	
	
	public void if_condition()
	{
		Scanner val = new Scanner(System.in);
		System.out.println("Enter the value of i");
		int i= val.nextInt();
		if(i<=10) 
			System.out.println("Entered i value is less than equal to 10"+ " " + "i.e" + " " +i);
	}//m1
		
	public void else_if_condition()
	{
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
	}//m2
	
	
	
	public void if_else_condition()
	{
		Scanner val = new Scanner(System.in);
		System.out.println("Enter the value of i");
		int i= val.nextInt();
		
		
		
		
		
		if(i<=10) {
			System.out.println("Entered i value is less than equal to 10"+ " " + "i.e" + " " +i);
			
		}
		else
			System.out.println("Entered value is greater than 10" + " " + "i.e" + " " +i);

	}//m3
	
	public void Nested_if() {
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

	}//m4
	
	
	//main method to execute methods
	
	public static void main(String[] args) {
		//creating object to call methods in the class:  Methods_AllConditions
		Methods_AllConditions obj = new Methods_AllConditions();
		obj.else_if_condition();
		obj.if_condition();
		obj.Nested_if();
		obj.if_condition();
		
	}	
}

/*
OUTPUT:
enter the value of i
5
entered value is less than 9 i.e 5
Enter the value of i
6
Entered i value is less than equal to 10 i.e 6
enter the value of i
5
entered value is the middle value in between 0 to 10  i.e 5
Enter the value of i
9
Entered i value is less than equal to 10 i.e 9
*/