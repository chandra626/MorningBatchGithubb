package javaDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LuanchFacebook {
static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChandraMohan\\Documents\\Lib\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/home.php");
		
		driver.navigate().to("https://www.google.com/home.php");
			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().refresh();
			Thread.sleep(1000);
			driver.close();
	}

}
