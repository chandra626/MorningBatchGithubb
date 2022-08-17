package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class GetText_Method {
	WebDriver driver;
  @Test
  public void getTest_Method() throws Exception {
	  String str = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).getText();
	  Thread.sleep(2000);
	  System.out.println("Hello Text;"+str);
	  Thread.sleep(2000);
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
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
public void f() {
	
	driver.close();
	
	
}
}
