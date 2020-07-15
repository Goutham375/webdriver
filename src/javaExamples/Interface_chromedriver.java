package javaExamples;
interface webdriver 
{
	public void open_browser();
	public void enterurl();
	public void close_browser();
}//interface
class firefox implements webdriver { //multiple inheritance is possible by using keyword "implements" 

	public void open_browser() {
		System.out.println("firefox is open");
	}
	public void enterurl() {
		System.out.println("URL is entered");
	}
	public void close_browser() {
		System.out.println("firefox is closed");
	}
}//class chrome	
public class Interface_chromedriver implements webdriver { //multiple inheritance is possible by using keyword "implements"

	 public void open_browser() {
			System.out.println("chrome is open");
		}
		public void enterurl() {
			System.out.println("URL is entered");
		}
		public void close_browser() {
			System.out.println("chrome is closed");
		} 
		public static void main(String[] args) {
			Interface_chromedriver driver1 = new Interface_chromedriver();
			driver1.open_browser();
			driver1.enterurl();
			driver1.close_browser();
			webdriver driver2 = new firefox(); 
			driver2.open_browser();
			driver2.enterurl();
			driver2.close_browser();		
		}//void main
}//class

/*
chrome is open
URL is entered
chrome is closed
firefox is open
URL is entered
firefox is closed
*/
