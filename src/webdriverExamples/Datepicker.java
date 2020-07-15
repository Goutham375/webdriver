package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Goutham's folder\\selinium files and eclipse\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.cleartrip.com/");// search for the url
		driver.manage().window().maximize();//maximizes the window
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"FromTag\"]")).sendKeys("Hyder");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		driver.findElement(By.xpath("//*[@id=\"ToTag\"]")).sendKeys("del");
		Thread.sleep(4000);
		driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
		driver.findElement(By.xpath("//*[@id=\"DepartDate\"]")).click();;
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[3]/td[5]/a")).click();
		Thread.sleep(3000);
		driver.quit();
	}//void main
}//class
