package log4j;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Log4jDemo {
	WebDriver driver;
  @Test
  public void log4java() throws InterruptedException {
	  Logger log=Logger.getLogger("google Project");
	  PropertyConfigurator.configure("log4j.properties");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChandraMohan\\Documents\\Lib\\chromedriver.exe");
	  driver=new ChromeDriver();
	  log.info("Luanch The Google Browser");
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	  log.info("Luanch Google URL Browser");
	  driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Log4j");
	  log.info("Type The Log4j");
	  driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
	  log.info("Enter Button in Press");
	  driver.findElement(By.xpath("//a[normalize-space()='Images']")).sendKeys(Keys.ENTER);
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//div[23]//a[1]//div[1]//img[1]")).click();
	  log.info("press on Right Click");
	  Thread.sleep(4000);
	  log.info("This will be Wait for 4seconds");
	  driver.close();
	  log.info("Close The Browser");
	  
  }
  @BeforeTest
  public void beforeTest() {
	/*  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChandraMohan\\Documents\\Lib\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();*/
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(4000);
	  driver.close();
  }

}
