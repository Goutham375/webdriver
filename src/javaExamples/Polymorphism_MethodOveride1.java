package javaExamples;

class Polymorphism_MethodOveride {
	public void overRide(int a, int b) {
	
		System.out.println("Addition of a and b is " +a+b);
		System.out.println("Method: overide in class: Polymorphism_MethodOveride is executed");
	}//overide1 method
}//superclass

public class Polymorphism_MethodOveride1 extends Polymorphism_MethodOveride {
	 public void overide(int a, int b) //here the method and signature of both the methods are same but as one is from superclass and another one is from child class it won't act as duplicate this is called MethodOverRidding 
	 {
		 System.out.println("Multiplication of a and b is "+ a*b);
		 System.out.println("Method: Overide in class: Polymorphism_MethodOveride is executed ");
	 }//method1 in Polymorphism_MethodOveride1
	  
	 
	 public static void main(String[] args)
	 {
		 Polymorphism_MethodOveride1 obj = new Polymorphism_MethodOveride1();
		 obj.overRide(9, 6);
		 obj.overide(9, 4);
	 }//void main 
}// class B
/* OUTPUT
Addition of a and b is 96
Method: overide in class: Polymorphism_MethodOveride is executed
Multiplication of a and b is 36
Method: Overide in class: Polymorphism_MethodOveride is executed 
 */

