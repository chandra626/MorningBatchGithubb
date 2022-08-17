package actions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class MouseHover {
	WebDriver driver;
  @Test
  public void mouseHover() throws InterruptedException {
	  driver.get("http://seleniumlearn.com/");
	  Thread.sleep(3000);
	  Actions act=new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("//a[@class='sf-depth-1 menuparent sf-with-ul']"))).build().perform();
	  Thread.sleep(3000);
	  act.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Interview Q&A']"))).click().perform();
	  Thread.sleep(3000);
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\ChandraMohan\\Documents\\Lib\\geckodriver.exe");
	  Thread.sleep(2000);
	  driver = new FirefoxDriver();
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
