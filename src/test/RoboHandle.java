package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
		
		public class RoboHandle{
			   public static void main(String[] args) throws AWTException {
				   System.setProperty("webdriver.edge.driver", "C:\\ShiftGear\\Drivers\\msedgedriver.exe");
					
					WebDriver driver = new EdgeDriver();
					
					driver.manage().window().maximize();
					
			        driver.get("https://www.foundit.in/seeker/registration");
			        
			      //driver.manage().window().maximize();    // scroll to reach upload button
			      //JavascriptExecutor j = (JavascriptExecutor)driver;
			      //j.executeScript("scroll(0,200)");
			      // file path passed as parameter to StringSelection
			      driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[4]/div/div/div/form/div[1]/div[2]/div/div/div[1]/div/label/span")).click();
			      Robot r = new Robot();
			      StringSelection s = new StringSelection("C:\\ShiftGear\\Drivers\\Test_RobotClass");
			      // Clipboard copy
			      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
			      //identify element and click
			      //driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[4]/div/div/div/form/div[1]/div[2]/div/div/div[1]/div/label/span")).click();
			      // Robot object creation

			      //pressing enter
			      r.keyPress(KeyEvent.VK_ENTER);
			      //releasing enter
			      r.keyRelease(KeyEvent.VK_ENTER);
			      //pressing ctrl+v
			      r.keyPress(KeyEvent.VK_CONTROL);
			      r.keyPress(KeyEvent.VK_V);
			      //releasing ctrl+v
			      r.keyRelease(KeyEvent.VK_CONTROL);
			      r.keyRelease(KeyEvent.VK_V);
			      //pressing enter
			      r.keyPress(KeyEvent.VK_ENTER);
			      //releasing enter
			      r.keyRelease(KeyEvent.VK_ENTER);
			
	}

}
