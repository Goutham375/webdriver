package javaExamples;

public class SampleProgram_ReverseString {

	public static void main(String[] args) {
	
	String name = "Goutham";
	String reverse = "";
	System.out.println("name before reversing is " + name);
	 
	for(int i= name.length()-1; i>=0;i--) {
		reverse = reverse + name.charAt(i);
	}//for
	System.out.println("name after refersing is " + reverse);
	}//void main
}//class

/* OUTPUT
name before reversing is Goutham
name after refersing is mahtuoG
*/
