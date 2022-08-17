package x_path;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Locators {
static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChandraMohan\\Documents\\Lib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.get("http://www.seleniumlearn.com/user");
		
	}
	
	@Disabled
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.close();
	}


	@Test
	void chanra1() throws InterruptedException {
		//infail("Not yet implemented");
		Thread.sleep(3000);
		driver.findElement(By.name("name")).sendKeys("chandra");
		Thread.sleep(3000);
		//driver.close();
		driver.findElement(By.name("pass")).sendKeys("selenium@123");
		Thread.sleep(3000);
		driver.findElement(By.name("op")).click();
		
	
		
	}

}
