package actions;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;

public class DragAndDrop {
	WebDriver driver;
  @Test
  public void DragAndDrap() throws Exception {
	  driver.get("http://www.seleniumlearn.com/drag-and-drop-html");
	  Thread.sleep(2000);
	  Actions act=new Actions(driver);
	  Thread.sleep(2000);
	  WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
	  Thread.sleep(2000);
	  WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
	  Thread.sleep(2000);
	  act.dragAndDrop(source, target).build().perform();
	  Thread.sleep(2000);
  }
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChandraMohan\\Documents\\Lib\\chromedriver.exe");
	  Thread.sleep(2000);
	  driver=new ChromeDriver();
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
  }



  
}
