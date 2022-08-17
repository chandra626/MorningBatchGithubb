package actions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class RightClick {
	WebDriver driver;
  @Test
  public void RightClick() throws Exception {
	  driver.get("http://seleniumlearn.com/user");
	  Thread.sleep(2000);
	  Actions act=new Actions(driver);
	  Thread.sleep(2000);
	  act.contextClick(driver.findElement(By.linkText(""))).build().perform();
	  Thread.sleep(2000);
	  
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
