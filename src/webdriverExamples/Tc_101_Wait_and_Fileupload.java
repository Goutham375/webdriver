package webdriverExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tc_101_Wait_and_Fileupload {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Goutham's folder\\selinium files and eclipse\\drivers\\chromedriver.exe");
		
		//launch chrome browser instance
		WebDriver driver =new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");// search for the url
		driver.manage().window().maximize();//maximizes the window
		System.out.println("Opened url");
		//Explicit wait command
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Submit")));
		System.out.println("wait command added");
		//verify using title
		if(driver.getTitle().matches("OrangeHRM - New Level of HR Management")) {
			System.out.println("Title verified");
		}
		else
			System.out.println("title mismatch");
		//enter user name and password then add explicit wait for login button
		driver.findElement(By.name("txtUserName")).sendKeys("goutham_970");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Submit")));
		driver.findElement(By.name("Submit")).click();
		System.out.println("logged in");
		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.println("implicitly waited");
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//*[@id='standardView']/div[3]/div[1]/input[1]")).click();
		String empid =driver.findElement(By.id("txtEmployeeId")).getAttribute("value");
		System.out.println("employ id is " + empid);
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Selinium");
		Thread.sleep(3000);
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Goutham");
		Thread.sleep(2000);
		WebElement upload=driver.findElement(By.name("photofile"));
		upload.sendKeys("D:\\Goutham's folder\\Gouthampicture.JPG");//uploads photo from system
		Thread.sleep(3000);
		driver.findElement(By.id("btnEdit")).click();
		System.out.println("photo uploaded");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();// switch to default from frame
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Loged out");
		driver.close();				
	}//void main
}//class

/*OUTPUT
Starting ChromeDriver 83.0.4103.39 (ccbf011cb2d2b19b506d844400483861342c20cd-refs/branch-heads/4103@{#416}) on port 5763
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
Jul 04, 2020 11:05:06 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
Opened url
wait command added
Title verified
logged in
implicitly waited
employ id is 0015
photo uploaded
Loged out
*/