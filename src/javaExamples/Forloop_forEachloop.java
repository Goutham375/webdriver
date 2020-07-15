package javaExamples;

import java.util.Scanner;

public class Forloop_forEachloop {
	

	public void for_loop()
	{
		int i;
		for(i=0;i<=30;i+=3)
		System.out.println(i);
		
		
		
	}//m for
	
	public void table() {
		int i;
		System.out.println("Program to print a table");
		Scanner val = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num= val.nextInt();
		
		for(i=1;i<=10;i++)
		{
			//int res= num * i;
			System.out.println(num +"*" +i +"=" + num* i );
		}
	}//m2
	
	public void for_each() {
		//For-each is another array traversing technique like for loop, while loop, do-while loop introduced in Java5.
		
		int marks[] = {90,98,98,97,93}; // storing values in a one dimention array marks[]
		
		for (int i : marks) {
			
			System.out.println(i);
			
		}
	}//m3
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Forloop_forEachloop m1 = new Forloop_forEachloop();
		
		//m1.for_loop();
		//m1.table();
		m1.for_each();

	}
}
/*
OUTPUT:
90
98
98
97
93
*/