package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class CrossbrowserDemo2 {
	WebDriver driver;
	
  @Test (description="HERO")
  public void run() throws Exception {
	  driver.get("https://www.google.com/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("superstarkristna"+Keys.ENTER);
	  
	  
  }
  @Parameters({"browser"})
  @BeforeTest  
  public void openbrowser (String browser) throws Exception {
	  try {
		  
		  if(browser.equalsIgnoreCase("chrome")) {
			  Thread.sleep(2000);
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChandraMohan\\Documents\\Lib\\chromedriver.exe");
			  Thread.sleep(2000);
			  driver =new ChromeDriver();
			  Thread.sleep(2000);
			  driver.manage().window().maximize();
			 
			  Thread.sleep(2000);
			  
			  
		  }
			  
		  else if(browser.equalsIgnoreCase("firefox")) {
			  Thread.sleep(2000);
		  	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\ChandraMohan\\Documents\\Lib\\geckodriver.exe");
			  driver=new FirefoxDriver();
			  Thread.sleep(2000);
			  driver.manage().window().maximize();
			  Thread.sleep(2000);
			  
		  }
		  }
		  
	  
		 catch (WebDriverException e) { 
			 System.out.println(e.getMessage());
			 Thread.sleep(2000);
		 }
		  
	  
	  }
  
  

  @AfterTest
  public void afterTest() throws Exception {
	  
	  Thread.sleep(2000);
	  driver.close();
  }
	  
}
