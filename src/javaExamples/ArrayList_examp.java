package javaExamples;

import java.util.ArrayList;

public class ArrayList_examp {

	public static void main(String[] args) { // elements can be added and removed from an ArrayList whenever you want, which is not possible in built using arrays
		// TODO Auto-generated method stub
		
			ArrayList<String> phones = new ArrayList<String>(); // creatinf array list object
			
			phones.add("oneplus");// add method adds the strinf value into arraylist
			phones.add("Samsung");
			phones.add("apple");
			phones.add(0, "Nokia"); // this syntax puts the string value i.e., Nokia at the first possition in the arraylist
			System.out.println("First element in the Arraylist is " + ":" + phones.get(0)); // prints the element which is at the first position in the array list i.e nokia

			
			System.out.println("elements in arraylist before removing");
			for (String string : phones) {
				System.out.println(string); // prints all the elements in arraylist before removing
				
			}
			
			phones.remove(3);// syntax used to removes an element from the arrayllist w.r.t index number
			
			System.out.println("size of arraylist after removing an element is" + ":" + phones.size()); // prints the size of arraylist 
			
			System.out.println("elements in the arraylist after removing an element");
			
			for (String after_removing : phones) {
				
				System.out.println(after_removing);		
			}//for
	}//void main
}// class

/* OUTPUT:
First element in the Arraylist is :Nokia
elements in arraylist before removing
Nokia
oneplus
Samsung
apple
size of arraylist after removing an element is:3
elements in the arraylist after removing an element
Nokia
oneplus
Samsung


*/