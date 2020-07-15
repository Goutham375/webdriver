package javaExamples;

public class Exceptions {

	public static void main(String[] args) {
	    int a[] = {10,20,30,40};
	    try {// tries to find the runtime error
	    System.out.println("Access element three :" + a[40]);
	    System.out.println("Testing"); 
	    }
	    catch(Exception e) // captures runtime error
	    {
	    System.out.println("Exception thrown123  :" + e);
	    }
	    finally
	    {
	    	System.out.println("First element value: " +a[1]);
	    	System.out.println("The finally statement is executed");
	    } 
	}// void main
}//class

/*OUTPUT
Exception thrown123  :java.lang.ArrayIndexOutOfBoundsException: 40
First element value: 20
The finally statement is executed

*/