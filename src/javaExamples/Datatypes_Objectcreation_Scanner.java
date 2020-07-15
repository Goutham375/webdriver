package javaExamples;

import java.util.Scanner;

public class Datatypes_Objectcreation_Scanner {

	public static void main(String args[]) {
			
			
		Scanner val = new Scanner(System.in);
		
		System.out.println("enter String, int, float, double, long, short");
		 
		
		String  name= val.nextLine();
		
		int i= val.nextInt();
		
		float f= val.nextFloat();
		
		double d= val.nextDouble();
		
		long l =val.nextLong();
		
		short sh =val.nextShort();
		
		
		System.out.println("name is " + name);
		System.out.println("int value is" + " " +i);
		System.out.println("float value is" + " " + f);
		System.out.println("double value is" + " " + d);
		System.out.println("long value is" + " " + l);
		System.out.println("short value is" + " " + sh);
		
		}//main
}//class

/*OUTPUT
enter String, int, float, double, long, short
Goutham
5
4.3
8.7
-5
32
name is Goutham
int value is 5
float value is 4.3
double value is 8.7
long value is -5
short value is 32

 */
