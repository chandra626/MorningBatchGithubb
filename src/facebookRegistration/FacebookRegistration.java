package facebookRegistration;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FacebookRegistration {
	WebDriver driver;
	@Test
	public void facebookLogin() throws InterruptedException {
		driver.get("https://www.facebook.com/user/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("chandra");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("bandaru");

		driver.findElement(By.xpath("//input[@id='u_0_0_wx']")).click();


		//	  driver.findElements(By.id("password_step_input").se*/
	}
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();

	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}

}
