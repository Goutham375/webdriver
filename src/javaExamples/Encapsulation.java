package javaExamples;

public class Encapsulation { //   Is a process of binding or wrapping the data and the codes that operates on the data into a single entity
	private String name = "Goutham";
	private String like = "I like programing";
	
	public void info() {
		System.out.println("My name is " + name);
		System.out.println(like);
	}//method info
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.info();
	}//void main
	
}//class encap

/*OUTPUT:
My name is Goutham
I like programing
*/
