package x_path;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Absolute {
static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChandraMohan\\Documents\\Lib\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		driver.get("http://seleniumlearn.com/user");
		
		Thread.sleep(2000);
		
	}

	@Test
	void test() throws Exception {
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/main/div/section/div/div[2]/form/div/div[1]/input")).sendKeys("DonChandra");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"edit-pass\"]")).sendKeys("MangalamDon");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='edit-captcha-response']")).sendKeys("14");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@name=\"op\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='edit-name']")).clear();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
		
		
		
	}

}
