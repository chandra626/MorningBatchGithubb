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

public class CrossBrowser {
	WebDriver driver;
  @Test
  public void run() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.get("https://google.com");
	  Thread.sleep(2000);
	  driver.findElement(By.name("q")).sendKeys("chandramohan"+Keys.ENTER);
	  Thread.sleep(2000);
  }
  @Parameters({"browser"})
  @BeforeTest
  public void openBrowser(String browser) throws Exception {
	  
	  try {
		  if (browser.equalsIgnoreCase("chrome")) {
			  System.setProperty("webdriver.chrome.driver","C:\\Users\\ChandraMohan\\Documents\\Lib\\chromedriver.exe");
			  Thread.sleep(2000);
			  driver=new ChromeDriver();
			  Thread.sleep(2000);
			  driver.manage().window().maximize();
			  Thread.sleep(2000);
			 
			  
		  }
		  else if(browser.equalsIgnoreCase("firefox")) {
			  System.setProperty("webdriver.gecko.driver", "C:\\Users\\ChandraMohan\\Documents\\Lib\\geckodriver.exe");
			  
			  driver=new FirefoxDriver();
			  Thread.sleep(2000);
			  driver.manage().window().maximize();
			  Thread.sleep(2000);
			 
		  }
		  }
		   /*        
          else if (browser.equalsIgnoreCase("Edge")) {
              System.setProperty("webdriver.edge.driver", "F:\\lib\\msedgedriver.exe");
  		driver = new EdgeDriver();
          }
          
             else if (browser.equalsIgnoreCase("IE")) {
              System.setProperty("webdriver.ie.driver","D:\\lib\\IEDriverServer.exe");
              driver = new InternetExplorerDriver();
          }

          else if (browser.equalsIgnoreCase("opera")) {
              System.setProperty("webdriver.opera.driver","D:\\lib\\operadriver.exe");  //--->IE for Windows path
              driver=new OperaDriver();
           }

      else (browser.equalsIgnoreCase("safari")) {
          System.setProperty("webdriver.safari.driver", "D:\\lib\\safariDriver.exe"); //To stop uninstall each time
           driver = new SafariDriver();
           }*/
		  
	  
		  catch (WebDriverException e) {
			  System.out.println(e.getMessage());
		  }
	  
  }

/*  @AfterTest
  public void afterTest() {
	  driver.close();
  }*/

}