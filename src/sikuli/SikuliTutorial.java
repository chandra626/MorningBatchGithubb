package sikuli;

import org.testng.annotations.Test;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;

public class SikuliTutorial {
	Screen s = new Screen();
  @Test
  public void sikulidesktopautomation() throws FindFailed, InterruptedException {
	 /* s.click("C:\\Users\\ChandraMohan\\Pictures\\Sikuli\\SL.PNG");
	 Thread.sleep(5000);
	  s.click("C:\\Users\\ChandraMohan\\Pictures\\Sikuli\\Ff.PNG");
	  Thread.sleep(4000);
	 s.type("C:\\Users\\ChandraMohan\\Pictures\\Sikuli\\SearchBar.PNG", "king");*/
	  Thread.sleep(7000);
	  s.dragDrop("C:\\Users\\ChandraMohan\\Pictures\\Sikuli\\b.PNG","C:\\Users\\ChandraMohan\\Pictures\\Sikuli\\c.PNG" );
	  
  }
  @BeforeTest
  public void beforeTest() {
  }

}
