package javaExamples;

//cresting multiple classes to perform inheritance (Parent class, child class, Grand child class)
class Parent_class {
	int a=3;
	int b=9;
	public void method1_add()
	{
		System.out.println("Addition of a and b = " + a+b);// performs addition of a and b when method1_add is called
		System.out.println("Method1_add in Parent class is executed");
	}//method1_add
	
	}//parent_class

class Child_class extends Parent_class { // extends is the keyword to perform inheritance using this Child class will be given access to perform operations which belongs to Parent class
	int c= 8;
	int d=9;
	public void method1_mul()
	{
		System.out.println("multiplication of c annd b = " + c*d); //performs mul of c and d 
		System.out.println("multiplication of a and b = " + a*b); // as child class is extending of parent's class, Child class has access to inherit the values of a and b
		System.out.println("method1_mul of Child class is executed");
	}//method1_mul	
}//Child class : Example of single level inheritance

public class Inheritance_GrandChild_class extends Child_class  { // as Grandchild_class is extension of Child's class. Grandchld_class can inherir methods of Child_class and Parent_class
	
	double e = 8;
	double f = 5;
	public void method1_div() {
		System.out.println("Division of e and f = " + e/f);
		System.out.println("method1_div of Grandchild_class is executed");// 
	}// mrthod1_div
	//Grand child clas : Example of multi level inheritance

public static void main(String[] args)
{
	
	Inheritance_GrandChild_class obj =  new Inheritance_GrandChild_class(); // by creating obj for GrandChild_class we can call methods of all three classes
	obj.method1_add();
	obj.method1_mul();
	obj.method1_div();
}//void main
}

/*OUTPUT:
Addition of a and b = 39
Method1_add in Parent class is executed
multiplication of c annd b = 72
multiplication of a and b = 27
method1_mul of Child class is executed
Division of e and f = 1.6
method1_div of Grandchild_class is executed
*/