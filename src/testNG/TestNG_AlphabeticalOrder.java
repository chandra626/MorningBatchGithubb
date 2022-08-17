package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_AlphabeticalOrder {
	WebDriver driver;
	@Test (groups="Retesting")
	public void google() {
		driver.get("https://www.google.com/");
		
	}
	@Test (groups="Retesting")
	public void fb() {
		driver.get("https://www.fb.com/");
		
	}
	@Test (groups="Retesting")
	public void samsung() {
		driver.get("https://www.samsung.com/");
		
	}
	@Test (groups="Retesting")
	public void lg() {
		driver.get("https://www.lg.com/");
		
	}
	@Test (groups="Retesting")
	public void selenuimdev() {
		driver.get("https://www.selenium.dev/");
		
	}
	@Test (groups="Retesting")
	public void gm() {
		driver.get("https://www.gm.com/");
		
	}
	@Test (groups="Retesting")
	public void bosch() {
		driver.get("https://www.bosch.com/");
		
	}
	@Test (groups="Retesting")
	public void usha() throws InterruptedException {
		driver.get("https://www.usha.com/");
		
	}
	@Test (groups="Retesting")
	public void sony() {
		driver.get("https://www.sony.com/");
		
	}
	@BeforeTest (groups="Retesting")
	public void beforeTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChandraMohan\\Documents\\Lib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@AfterTest (groups="Retesting")
	public void afterTest() {
		driver.close();
	}

}
