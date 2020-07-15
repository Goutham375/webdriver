package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Goutham's folder\\selinium files and eclipse\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
			System.out.println("Tc001 Title matched, url is checked");
		}
		else {
			System.out.println("Tc001 Title mismatch");
		}
		driver.manage().window().maximize();//maximizes the window
		driver.findElement(By.name("txtUserName")).sendKeys("goutham_970");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		if(driver.getTitle().equals("OrangeHRM")) { // compares the actual and expected title
			System.out.println("Tc002 Title matched loged in sucessfully");
		}
		else {
			System.out.println("Tc002 Title mismatch" + driver.getTitle());
		}
		Actions act = new Actions(driver);
		WebElement pim =driver.findElement(By.linkText("PIM"));
		act.moveToElement(pim).perform();
		System.out.println("Mouse over performed sucessfully");
		driver.findElement(By.linkText("Add Employee")).click();
		if(driver.getTitle().equals("OrangeHRM"))
		{
			System.out.println("Tc003 add employee page varified");
		}
		else
		{
			System.out.println("add employe page missmatch");
		}
		Thread.sleep(3000);		
		System.out.println("Tc004 employee added sucessfully");	
	}//void main
}//class

/*OUTPUT
Starting ChromeDriver 83.0.4103.39 (ccbf011cb2d2b19b506d844400483861342c20cd-refs/branch-heads/4103@{#416}) on port 26627
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
Jul 01, 2020 8:32:42 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
Tc001 Title matched, url is checked
Tc002 Title matched loged in sucessfully
Mouse over performed sucessfully
Tc003 add employee page varified
Tc004 employee added sucessfully
*/
