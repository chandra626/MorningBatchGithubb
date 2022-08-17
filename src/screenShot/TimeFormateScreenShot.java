package screenShot;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TimeFormateScreenShot {
	WebDriver driver;
	@Test
	public void Screenshot() throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss");
		Date date = new Date();
		String time = dateFormat.format(date);

		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("E:\\Screenshot\\SL_" + time + ".png"));
	}
	@Test
	public void seleniumlearn() throws Exception {
		driver.get("http://seleniumlearn.com/");
		Thread.sleep(3000);
		Screenshot();

	}
	@Test
	public void google() throws InterruptedException, IOException {

		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		Screenshot();
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Screensoht using Selenium"+Keys.ENTER);
		Screenshot;
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.manage().window().maximize();
	}



	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
