package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class GetText {
	WebDriver driver;
  @Test
  public void Get_Text() {
	  String obj = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnI']")).getText();
	  System.out.println(obj);
	  
	  
  }
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChandraMohan\\Documents\\Lib\\chromedriver.exe");
	  Thread.sleep(2000);
	  driver=new ChromeDriver();
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.get("https://www.google.com/");
	  Thread.sleep(2000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
