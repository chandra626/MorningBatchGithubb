package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DataProvider_Demo3 {
	WebDriver driver;
	
	String str;
	@DataProvider(name="datainput")
	public String[][] login(){
		return new String[][] {
			{"a","b"},
			{"c","2"},
			{"d","3"},
			{"ashok","9000109120"},
			{"chandra","bhibsjfkher"}
		};
			
		}
	
	
  @Test (dataProvider="datainput")
  public void longin(String user,String pass) throws InterruptedException {
	  Thread.sleep(2000);
	  driver.get("http://prakampanam.com/user");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='edit-name']")).sendKeys("user");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='edit-pass']")).sendKeys("pass");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
	  Thread.sleep(2000);
	  try {
		  
		  driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();
		  str="pass";
		  System.out.println("str");
	  }
	  catch (Exception e ) {
		  str="fail";
		  System.out.println("str");
		  
		  
	  }
	  
	  }
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChandraMohan\\Documents\\Lib\\chromedriver.exe");
	  Thread.sleep(3000);
	  driver=new ChromeDriver();
	  Thread.sleep(3000);
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
