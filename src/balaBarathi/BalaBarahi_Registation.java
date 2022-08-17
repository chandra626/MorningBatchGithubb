package balaBarathi;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.Key;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BalaBarahi_Registation {
	WebDriver driver;
  
  @Test
  public void launch_balabarathi() throws InterruptedException {
	
	  driver.get("http://baalabharathi.com/upload-story/");
	  driver.findElement(By.xpath("//input[@id='text-13263966988']")).sendKeys("asdf");
	  driver.findElement(By.xpath("//input[@id='text-241482569216']")).sendKeys("fdsa");
	  driver.findElement(By.xpath("//input[@id='text-23732060291']")).sendKeys("mchandra626@gmail.com");
	  driver.findElement(By.xpath("//input[@id='field-DVYLZM9QELAAq8K']")).sendKeys("7032004119");
	  driver.findElement(By.xpath("//input[@id='field-krP8MPeuzRrukdo']")).sendKeys("8-21/A");
	  driver.findElement(By.xpath("//input[@id='field-IQsTTT9SxEPs3LH']")).sendKeys("4-20/D");
	  driver.findElement(By.xpath("//input[@id='field-2Ngu0gfcgyZYrFE']")).sendKeys("Tirupati");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div/article/div/div/div/section/div/div[2]/div/div/div/div/div/form/div[1]/div/div[9]/input")).sendKeys("517507");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//select[@id='field-5gVECDat8HE4BHW']")).sendKeys("china");
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//input[@id='field-8lqEle2zeOhMu0a']")).sendKeys("C:\\Users\\ChandraMohan\\Pictures\\CAMERA\\20210509_090231.jpg");
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@id=\"textarea-5589244956\"]")).sendKeys("Software Testing\n"
	  		+ "Manual Testing + Selenium with Java");
	  Thread.sleep(4000);
	 new Select(driver.findElement(By.xpath("//select[@id='field-rUN19TKpQsSOX3X']"))).deselectByVisibleText("Ages 7-12 Years Audio Book");
	
	  driver.findElement(By.xpath("//button[@id='button-20216154383']")).submit();
	
	  Thread.sleep(4000);
	 driver.close();
	  
	 	  
  }
 
   @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\ChandraMohan\\Documents\\Lib\\chromedriver.exe");
	  Thread.sleep(2000);
	  driver=new ChromeDriver();
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  

  }
   

}
