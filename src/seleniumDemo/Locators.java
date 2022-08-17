package seleniumDemo;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Locators {
	static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChandraMohan\\Documents\\Lib\\chromedriver.exe");
		Thread.sleep(3000);
		driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.get("http://seleniumlearn.com/user");



	}


	@Test
	void id() throws Exception {
		//fail("Not yet implemented");
		driver.findElement(By.id("edit-name")).sendKeys("Chandra");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("Manual@2022");
		Thread.sleep(2000);
		driver.findElement(By.name("captcha_response")).sendKeys("15");
		Thread.sleep(2000);
		driver.findElement(By.className("form-submit")).click();
	}

}
