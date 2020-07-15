package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptExecutor {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\Goutham's folder\\selinium files and eclipse\\drivers\\chromedriver.exe");
		
		//launch chrome browser instance
		WebDriver driver =new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");// search for the url
		driver.manage().window().maximize();//maximizes the window
		System.out.println("Opened url");
		//Explicit wait command
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Submit")));
		driver.findElement(By.name("txtUserName")).sendKeys("goutham_970");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Submit")));
		//clicking login button using JavaScript
		WebElement element= driver.findElement(By.name("Submit"));
		JavascriptExecutor executor = (JavascriptExecutor)driver; //interface
		executor.executeScript("arguments[0].click();", element);//can inject javascript into browser at runtime by using javaScriptExecutot
		System.out.println("Loged in");
		executor.executeScript("arguments[0].click()", driver.findElement(By.linkText("Logout")));
		System.out.println("Loged out");
		driver.close();
	}//void main
}//class

/*OUTPUT
Starting ChromeDriver 83.0.4103.39 (ccbf011cb2d2b19b506d844400483861342c20cd-refs/branch-heads/4103@{#416}) on port 27706
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
Jul 04, 2020 11:32:05 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
Opened url
Loged in
Loged out
*/
