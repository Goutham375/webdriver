package javaExamples;

public class Whileloop_SumofNaturamnumbers {
	

	public static void main(String[] args) {
		int num= 100,i=1,sum= 0;
		
		while(i<=num) {
			
			sum= sum+i;  // i value will be iterated 101 times but here only 100 times is considered b'caz 101 fails the condition
				i++; // if we do not give proper inc/dec statement while loop will be executed infinate number of times.
		}
		

		System.out.println(sum);
		System.out.println(i); // i value will be printed as 101 if we print the value outsidde the while loop
		
	}

}
 /*
OUTPUT:
5050
101

*/