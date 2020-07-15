package javaExamples;

abstract class Bank {  // superclass
abstract void credit();  
abstract void debit(); 
}//abstract class : It can have abstract methods(methods without body) as well as concrete methods (regular methods with body).

class HDFC extends Bank{  // as this class is extension of Class: Bank, only the methods from class:Bank can be inherited.
void credit() {   
	System.out.println("Amount credit from HDFC");  
	}  
void debit() 
{
	System.out.println("Amount debited from HDFC");  
	} 
} //class HDFC
class ICICI extends Bank{  // as this class is extension of Class: Bank, only the methods from class:Bank can be inherited.
	void credit() 
	{   
	System.out.println("Amount credit from ICICI");  
	}  
	void debit() 
	{   
	System.out.println("Amount debited from ICICI");  
	} 
	}//class HDFC  
public class Abstracton_TestBank{ // as this class is extension of Class: Bank, only the methods from class:Bank can be inherited.
	public static void main(String args[]) {  
	HDFC h = new HDFC();   
	h.credit();  
	h.debit();  
	ICICI i = new ICICI();
	i.credit();  
	i.debit();
	} 
	}//class Abstracton_TestBank
/* OUTPUT
Amount credit from HDFC
Amount debited from HDFC
Amount credit from ICICI
Amount debited from ICICI
*/