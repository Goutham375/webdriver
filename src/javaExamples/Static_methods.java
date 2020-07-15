package javaExamples;

public class Static_methods { // no need to create objects for static methods
	public static void Method1() {
		System.out.println("Daily I will practice selenium for 4 hours. ");
	}//m1
	public static void Method2() {
		System.out.println("Daily I will sleep only for 6 hours");
	}//m2
	public static void Method3() {
		System.out.println("Daily I will wake up at 6 clock");
	}//m3
	public static void main(String[] args) {
		Method1();
		Method2();
		Method3();
	}//void main
}//class

/*OUTPUT
Daily I will practice selenium for 4 hours. 
Daily I will sleep only for 6 hours
Daily I will wake up at 6 clock
*/