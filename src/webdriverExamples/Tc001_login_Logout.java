package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc001_login_Logout {

	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.chrome.driver", "D:\\Goutham's folder\\selinium files and eclipse\\drivers\\chromedriver.exe");
		
		//launch chrome browser instance
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");// search for the url
		driver.manage().window().maximize();//maximizes the window
		driver.findElement(By.name("txtUserName")).sendKeys("goutham_970");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Loged in sucessfully");
		driver.findElement(By.linkText("Logout")).click();;
		System.out.println("Loged out sucessfully");
		System.out.println("Tc001 is executed");
		Thread.sleep(3000);
		driver.close();//closes the window
			}//void main
}//class

/*OUTPUT
Starting ChromeDriver 83.0.4103.39 (ccbf011cb2d2b19b506d844400483861342c20cd-refs/branch-heads/4103@{#416}) on port 8983
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
Jul 01, 2020 7:09:42 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
dh
Loged in sucessfully
Loged out sucessfully
Tc001 is executed
*/
