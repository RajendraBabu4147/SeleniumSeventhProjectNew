

	package test;



	import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;


	public class multipleWindowsTest {

		public static void main(String[] args) throws InterruptedException {
			
			
			System.setProperty("webdriver.edge.driver", "C:\\ShiftGear\\Drivers\\msedgedriver.exe");
			
			WebDriver driver = new EdgeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://demoqa.com/browser-windows");
			
			driver.findElement(By.xpath("//button[contains(@id,'windowB')]")).click();
			
			
			WebElement prompt1 = driver.findElement(By.id("tabButton"));
			((JavascriptExecutor)driver).executeScript("arguments[0].click()",prompt1);
			
			WebElement prompt2 = driver.findElement(By.id("windowButtonWrapper"));
			((JavascriptExecutor)driver).executeScript("arguments[0].click()",prompt2);
			
			WebElement prompt3 = driver.findElement(By.id("messageWindowButton"));
			((JavascriptExecutor)driver).executeScript("arguments[0].click()",prompt3);
			
			
			
			
			String mainWindow = driver.getWindowHandle(); 
			System.out.print(mainWindow);
			
			
			Set <String> set1 = driver.getWindowHandles();
			
			Iterator <String> itr1 = set1.iterator();
			while(itr1.hasNext())
			{
				String childWindow = itr1.next();
				
				if (!mainWindow.equalsIgnoreCase(childWindow))
				{
					driver.switchTo().window(childWindow);
					System.out.println("Print child window message" +childWindow);
					
					
					driver.close();
					System.out.println("Child Window Closed");
				}
				
				
			}
			
			driver.switchTo().window(mainWindow);
			
			driver.quit();
			
			
			
	}

}
