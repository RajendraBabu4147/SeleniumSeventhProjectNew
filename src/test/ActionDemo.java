package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Second change");
		System.setProperty("webdriver.edge.driver", "C:\\ShiftGear\\Drivers\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
        driver.get("https://demoqa.com/buttons");
        
        
        //instantiate Actions class to perform below actions like double click, right click
        Actions obj1 = new Actions(driver);
        
        //right click a button "Right Click Me"
        WebElement rightBtn = driver.findElement(By.id("rightClickBtn"));
        
        //Action Chaining
        //obj1.contextClick(rightBtn).build().perform();
        
        //Performing without action chaining
        //obj1.contextClick(rightBtn).perform();
        obj1.moveToElement(rightBtn).contextClick(rightBtn).build().perform();
        
        //Action action = obj1.build();
        //action.perform();
                
                
        //Double clicking the button named Double Click me
        WebElement dblClickBtn = driver.findElement(By.id("doubleClickBtn"));
        obj1.doubleClick(dblClickBtn).perform();
	System.out.println("Second change - hello everyone end of program");
        driver.quit();
	}

}
