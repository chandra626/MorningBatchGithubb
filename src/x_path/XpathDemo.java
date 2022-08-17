package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
	
	static WebDriver driver ;

	public static <WebElements> void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChandraMohan\\Documents\\Lib\\chromedriver.exe");
		
		driver=new ChromeDriver ();
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.get("http://seleniumlearn.com/user");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/main/div/section/div/div[2]/form/div/div[1]/input")).sendKeys("donChndra");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"edit-pass\"]")).sendKeys("Donchandra@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='edit-captcha-response']")).sendKeys("14");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@name=\"op\"]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"edit-name\"]")).clear();
		Thread.sleep(3000);
		
		driver.close();
		

	}

}
