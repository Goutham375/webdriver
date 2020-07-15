package webdriverExamples;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assert_statement {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Goutham's folder\\selinium files and eclipse\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		assertTrue(driver.getTitle().matches("OrangeHRM - New Level of HR Management")); // Verifies the title of the page 
		System.out.println("tc001 title matched"); 
		driver.manage().window().maximize();//maximizes the window
		driver.findElement(By.name("txtUserName")).sendKeys("goutham_970");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		assertTrue(driver.findElement(By.xpath("//ul[@id='option-menu']/li")).getText().matches("Welcome Goutham_970"));
		System.out.println("tc002 Welcome page checked");
		Thread.sleep(400);
		driver.close();
	}//void main
}//class
/*OUTPUT
Starting ChromeDriver 83.0.4103.39 (ccbf011cb2d2b19b506d844400483861342c20cd-refs/branch-heads/4103@{#416}) on port 33819
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
Jul 02, 2020 7:54:07 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
tc001 title matched
tc002 Welcome page checked
*/