package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Goutham's folder\\selinium files and eclipse\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		Thread.sleep(3000);
		int row = driver.findElements(By.xpath("//div[@id='pnl_Bse']/table/tbody/tr")).size();
		System.out.println("Number of rows= "+ row);
		int col = driver.findElements(By.xpath("//div[@id='pnl_Bse']/table/tbody/tr[21]/td")).size();
		System.out.println("Number of colomns= " + col);
		int rowcol = driver.findElements(By.xpath("//div[@id='pnl_Bse']/table/tbody/tr/td")).size();
		System.out.println(rowcol);
		//data from perticular cell
		System.out.println("Data from 4th row 5th colomn is " + driver.findElement(By.xpath("//div[@id='pnl_Bse']/table/tbody/tr[4]/td[5]")).getText());
		//data from all the rows is
		System.out.println("Data from all the rows is :");
		for(int i=1; i<=row; i++) {
			String d = driver.findElement(By.xpath("//div[@id='pnl_Bse']/table/tbody/tr["+i+"]")).getText();

			System.out.println(d);
		}//for
		driver.close();
}//void main
}//class

/*OUTPUT
Starting ChromeDriver 83.0.4103.39 (ccbf011cb2d2b19b506d844400483861342c20cd-refs/branch-heads/4103@{#416}) on port 15698
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
Jul 04, 2020 2:24:48 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
Number of rows= 21
Number of colomns= 9
180
Data from 4th row 5th colomn is 2,890.00
Company LTP % Gain High Low Open Prev Close News Qtly Results
BHAAIR 581.10 4.05 582.95 560.75 560.75 558.50
HERHON 2,737.75 2.44 2,748.90 2,680.00 2,680.00 2,672.55
BAAUTO 2,934.30 2.28 2,958.75 2,890.00 2,890.00 2,868.75
TCS 2,199.00 1.88 2,203.15 2,160.05 2,160.05 2,158.35
TITIND 1,003.25 1.71 1,008.00 986.55 990.00 986.35
HCLTEC 579.00 1.61 580.35 571.00 572.00 569.85
POWGRI 177.70 1.54 179.35 175.65 175.75 175.00
RELIND 1,787.50 1.53 1,792.80 1,768.50 1,781.05 1,760.55
AXIBAN 428.50 1.17 431.20 423.60 430.00 423.55
TECMAH 567.00 1.11 572.30 561.30 563.00 560.75
NTPC 94.35 1.07 95.40 92.75 93.70 93.35
HINLEV 2,172.30 0.93 2,187.00 2,157.80 2,161.30 2,152.20
INFTEC 762.60 0.83 763.85 752.55 756.60 756.30
SUNPHA 476.90 0.79 479.00 472.25 475.00 473.15
ITC 207.35 0.66 208.45 206.00 207.70 206.00
ONGC 82.40 0.61 83.25 81.60 82.00 81.90
ASIPAI 1,696.10 0.56 1,719.80 1,689.00 1,689.00 1,686.70
LARTOU 944.50 0.41 955.00 942.00 945.00 940.65
KOTMAH 1,353.50 0.14 1,368.00 1,350.60 1,360.95 1,351.65
MAHMAH 530.30 0.10 535.45 524.20 530.00 529.75
*/
