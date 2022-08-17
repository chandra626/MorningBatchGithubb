package assertions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AssertDemo {
	WebDriver driver;
  @Test( enabled=false)
  public void assertions() {
	  driver.get("http://www.tirupatinews.in/");
	  String expTitle ="Vamsi";
	  System.out.println("Expected String Website Name is -"+expTitle);
	  String actTitle= driver.getTitle();
	  System.out.println("Actual Website Name is-"+actTitle);
	  
  }
  
  @Test
  public void verfyCurrentURL() {
	  driver.get("http://www.techlearn.in/");
	  String expURL="http://www.techlearn.in/";
	  System.out.println("Expected WebsiteURL Name is-"+expURL);
		String actTitle = driver.getTitle();
		
		System.out.println("Actual Website title is -"+actTitle);
		
		//Assert.assertEquals(actTitle, expTitle);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChandraMohan\\Documents\\Lib\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(7000);
	  driver.close();
  }

}
