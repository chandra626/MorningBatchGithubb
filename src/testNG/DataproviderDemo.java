package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class DataproviderDemo {
	WebDriver driver ;
	
	public String str;
	
	@DataProvider (name = "datainput")
	public String [][] login(){
		
		return new String[][] { 
			{ "ashok", "InValidPassword" }, 
			{ "ashok", "9000109120" },
			{ "chandra", "ABCDEF" },
			{ "ravi", "123456789" },
			{ "hari", "ABCDEFGHI" },
			{ "indraja", "9980251000"
				}
			} ;
		
		
	}
	
	
  @Test(dataProvider ="datainput")
  public void login(String user,String pass) throws InterruptedException {
	  driver.get("http://prakampanam.com/user");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='edit-name']")).sendKeys(user);
	  Thread.sleep(1000);
	  driver.findElement(By.name("pass")).sendKeys(pass);
	  Thread.sleep(1000);
	  driver.findElement(By.id("edit-submit")).click();
	  Thread.sleep(1000);
	  try {
		  driver.findElement(By.linkText("Log out")).click();
		  str ="Pass";
		  System.out.println(str);
	  }
		  catch (Exception e)
		  {
			  str ="Fail";
					  System.out.println(str);
		  }
		  
	  }
  
  
  @BeforeTest
  public void beforeTest
  () throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChandraMohan\\Documents\\Lib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();

  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }
}

 