package webdriverExamples;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\Goutham's folder\\selinium files and eclipse\\drivers\\chromedriver.exe");
			
			//launch chrome browser instance
			driver =new ChromeDriver();
			driver.get("http://127.0.0.1/orangehrm-2.6/login.php");// search for the url
			driver.manage().window().maximize();//maximizes the window
			//taking screenshot of element
			WebElement element = driver.findElement(By.name("Submit"));
			File el = ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(el, new File("D:\\Goutham's folder\\MagneQ_software_testing_course\\MagneQ_workspace for selinium programs\\element.png"));
			driver.findElement(By.name("txtUserName")).sendKeys("goutham_970");
			driver.findElement(By.name("Subm76it")).click();
			Thread.sleep(3000);
			Alert a = driver.switchTo().alert();
			System.out.println("alert text is: " + a.getText());
			a.accept();
			driver.quit();
			
		}//try
		catch (Exception e) {
			//take screenshot of page when error is detected
		File fi = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fi, new File("D:\\Goutham's folder\\MagneQ_software_testing_course\\MagneQ_workspace for selinium programs\\screenshots\\screenshot.png"));		
		}//catch			
	}//voidmain
}//class
