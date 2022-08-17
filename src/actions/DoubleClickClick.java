package actions;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DoubleClickClick {
	WebDriver driver;
  @Test
  public void doubleclick() throws InterruptedException {
	  driver.get("http://seleniumlearn.com/double-click");
	  Thread.sleep(5000);
	  Actions act=new Actions(driver);
	  Thread.sleep(5000);
	  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"node-104\"]/div/div[1]/div/div/button"))).doubleClick().click();
	  Thread.sleep(5000);
	  
	  }
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChandraMohan\\Documents\\Lib\\chromedriver.exe");
	  driver=new ChromeDriver();
	  Thread.sleep(1000);
	  driver.manage().window().maximize();
	  Thread.sleep(1000);
  }

  @AfterClass
  public void afterclass( ) {
	  driver.close();
  }
}
