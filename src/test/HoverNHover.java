package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverNHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.edge.driver", "C:\\ShiftGear\\Drivers\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
        driver.get("https://demoqa.com/menu/");
        
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/ul/li[1]/a"));
        action.moveToElement(we).moveToElement(driver.findElement(By.xpath("/expression-here"))).click().build().perform();
        
        
        driver.quit();
	}

}
