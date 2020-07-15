package webdriverExamples;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Goutham's folder\\selinium files and eclipse\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.microsoft.com/en-in/microsoft-365/onedrive/online-cloud-storage");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//open multiple windows or tabs
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.linkText("Sign up for free")).click();//opened 3 tabs
		Thread.sleep(3000);
		//in oorder to switch between the tabs we need to store window info in a arraylist and switch between them using switchto() command
		
		ArrayList<String> wind = new ArrayList<String>(driver.getWindowHandles());
		for (String windo : wind) {
			driver.switchTo().window(windo);
			Thread.sleep(3000);
			System.out.println("Active windowHandle value is " + windo );
		}// for
		driver.switchTo().window(wind.get(1));
		System.out.println("switching between windows using get command and window value is " + wind.get(1));
		driver.quit();// quit command is used to close all windows at once
	}//void main
}//class

/*OUTPUT
Starting ChromeDriver 83.0.4103.39 (ccbf011cb2d2b19b506d844400483861342c20cd-refs/branch-heads/4103@{#416}) on port 20355
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
Jul 04, 2020 12:17:31 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
Active windowHandle value is CDwindow-C97F3F67578DBCE847B132CB672E7661
Active windowHandle value is CDwindow-354C7E9A1CF89FABEF86E7895C00D573
Active windowHandle value is CDwindow-FDFE5DCC09579F598E11F95BCA6ADF16
switching between windows using get command and window value is CDwindow-354C7E9A1CF89FABEF86E7895C00D573
*/