package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_DDescriptionn {
	WebDriver driver;
	@Test (priority=7,description="Google")
	public void google() {
		driver.get("https://www.google.com/");
		
	}
	@Test (priority=6,description="Fb")
	public void fb() {
		driver.get("https://www.fb.com/");
		
	}
	@Test (priority=5,description="SS")
	public void samsung() {
		driver.get("https://www.samsung.com/");
		
	}
	@Test (priority=5,description="LG")
	public void lg() {
		driver.get("https://www.lg.com/");
		
	}
	@Test (priority=4,description="seelenium")
	public void selenuimdev() {
		driver.get("https://www.selenium.dev/");
		
	}
	@Test (priority=3,description="GM")
	public void gm() {
		driver.get("https://www.gm.com/");
		
	}
	@Test (priority=2,description="Bosch")
	public void bosch() {
		driver.get("https://www.bosch.com/");
		
	}
	@Test (priority=1,description="Usha")
	public void usha() throws InterruptedException {
		driver.get("https://www.usha.com/");
		Thread.sleep(1000);
	}
	@Test (priority=0,description="Sony")
	public void sony() {
		driver.get("https://www.sony.com/");
		
	}
	@BeforeTest
	public void beforeTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChandraMohan\\Documents\\Lib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
