package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DataProvder_Demo2 {
	WebDriver driver;
	String str;

	@DataProvider(name="datainput")
	public String[][] login() {
		return new String[][] {
			{" 1", "a" },
			{ "2", "b" },
			{      "ashok","9000109120" },
			{ "chandra","7032004119"}

		};
	}
	@Test(dataProvider = "datainput")
	public void login(String user, String pass) throws InterruptedException {
		Thread.sleep(2000);
		driver.get("http://prakampanam.com/User");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='edit-name']")).sendKeys(user);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='edit-pass']")).sendKeys(pass);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
		Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();
			
			str="pass";
			System.out.println(str);
		}
			catch (Exception e) {
			str="fail";
			System.out.println(str);
		}
		
		
	}
	@BeforeTest
	public void beforeTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChandraMohan\\Documents\\Lib\\chromedriver.exe");
		Thread.sleep(2000);
		driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
