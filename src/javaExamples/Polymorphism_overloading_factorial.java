package javaExamples;

public class Polymorphism_overloading_factorial { // Polymorphysm : Means one name with many forms there are two tpes 1.Method overloading 2. Method Overriding 
	 
	public void factorial(int x) // here int x can be called as parameter or signature
	{ 
		long factorial=1;
		for(int i=1; i<= x; ++i)
		{
			factorial = factorial*i;
		}//for
		System.out.println("Factorial value of " + x + " is " + factorial);
	}// factorial method
	
	public void factorial(int y, int z) { // here we have used same method name but the different signature i.e., 2 parameters, this is called Method overloading
		long factorial1=1;
		for(int i=1; i<= y; ++i)
		{
			factorial1 = factorial1*i;
		}//for
		System.out.println("Factorial value of " + y + " is " + factorial1);
		long factorial2 =1;
		for(int j=1; j<= z; ++j)
		{
			factorial2 = factorial2*j;
		}//for
		System.out.println("Factorial value of " + z + " is " + factorial2);
		
	}// method factorial with 2 inputs
	
	public static void main(String[] args) {
		
		Polymorphism_overloading_factorial obj = new Polymorphism_overloading_factorial();
		obj.factorial(10);
		obj.factorial(3, 20);	
	}//void main
}//class

/* OUTPUT:
Factorial value of 10 is 3628800
Factorial value of 3 is 6
Factorial value of 20 is 2432902008176640000
*/
