package javaExamples;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String phones[]= {"Oneplus", "apple", "mi", "nokia", "samsung"};  // arrays can be executed using their index number and the index number starta counting from zero
		
		//for example to print the 3rd value from the above statemment is
		
		System.out.println("Result without loop to print usinf index value is " + phones[3]);
		
		//in order to prinnt all the values in the array we need a for loop or foreach loop
		int i;
		for(i=0;i<phones.length;i++)
		{
			String var = phones[i];
			System.out.println("Result using for loop is" + ":"+var);
			
		}//for loop
		
		for (String string : phones) {// for each also gives the same output as for loop but for each loop cannot print the values from last to first
			
			System.out.println("Reslt using for each loop is"+ "=" + string);
			
		}//for each
		
		//to print the names of phones from last to first
		
		for(int j=4; j<phones.length;j--)
		{
			String reverse= phones[j];
			System.out.println("Result of printinf reverse of array is"+ ":" + reverse);
			
			if(j==0)  // to break the iteration when index j value reaches zero, if we do not give this condition iterations will go to -ve vales and gives error as there are no values for -ve index values
			break;
		}//for
	}// main
}

/*OUTPUT:
 * Result without loop to print usinf index value is nokia
Result using for loop is:Oneplus
Result using for loop is:apple
Result using for loop is:mi
Result using for loop is:nokia
Result using for loop is:samsung
Reslt using for each loop is=Oneplus
Reslt using for each loop is=apple
Reslt using for each loop is=mi
Reslt using for each loop is=nokia
Reslt using for each loop is=samsung
Result of printinf reverse of array is:samsung
Result of printinf reverse of array is:nokia
Result of printinf reverse of array is:mi
Result of printinf reverse of array is:apple
Result of printinf reverse of array is:Oneplus

 */
