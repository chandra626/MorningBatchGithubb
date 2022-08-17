package x_path;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Atagname {
	static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChandraMohan\\Documents\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();

		Thread.sleep(2000);

		driver.get("http://www.google.com/");

	}



	@Test
	void test() throws Exception {
		List<WebElement>googlelinks=driver.findElements(By.tagName("a"));

		System.out.println("Total number of links in Google website- "+ googlelinks.size());
		
		Thread.sleep(2000);
		
		
		driver.close();


	}

}
