package javaDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LuanchChromeBrowser {
	
  static WebDriver driver;
 
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChandraMohan\\Documents\\Lib\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().window().minimize();
Thread.sleep(2000);
driver.manage().window().maximize();
driver.manage().window().maximize();
Thread.sleep(1000);
driver.close();
	}

}
