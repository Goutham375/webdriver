package javaExamples;

public class Reverse_of_number {

	public static void main(String[] args) {
		int a=6789, reverse=0;
		System.out.println("number before reversing is " + a);
		while(a!=0) {
			int digit= a%10; // stores the remainder value in digit
			reverse = reverse * 10 + digit; // stores the last digit as first digit from the given number
			a = a/10; // eliminates the last digit 
		}
		System.out.println("After Reversing number is " + reverse);
	}//void main
}//class

/*OUTPUT
 number before reversing is 6789
After Reversing number is 9876
*/
