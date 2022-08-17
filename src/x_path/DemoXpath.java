package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoXpath {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChandraMohan\\Documents\\Lib\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://seleniumlearn.com/user");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/main/div/section/div/div[2]/form/div/div[1]/input")).sendKeys("sai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"edit-pass\"]")).sendKeys("sai@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='edit-captcha-response']")).sendKeys("15");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name=\"op\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"edit-name\"]")).clear();
		Thread.sleep(4000);
		driver.close();
	}

}
