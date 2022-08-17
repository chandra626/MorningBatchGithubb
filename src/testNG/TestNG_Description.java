package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_Description {
	private static final boolean True = false;
	WebDriver driver;
	@Test(priority=1,enabled=false,description="Twitter")
	public void twitter() {
		driver.get("https://www.twitter.com");
	}

	@Test(enabled=true,priority=3,description="Twitter")
	public void google() throws Exception {
		driver.get("https://www.google.com");
		
	}

	@Test(priority=2,enabled=true,description="Twitter")
	public void seleniumlearn() throws Exception {
		driver.get("http://www.seleniumlearn.com");
		Thread.sleep(5000);

	}

	@Test(enabled=True ,priority=4)
	public void facebook() {
		driver.get("https://www.facebook.com");
	}

	@Test(priority=0,description="selenuim.dev")
	public void seleniumdev() {
		driver.get("https://www.selenium.dev");
	}
  
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChandraMohan\\Documents\\Lib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  
  }

}
