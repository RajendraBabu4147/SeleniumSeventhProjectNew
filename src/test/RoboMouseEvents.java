package test;

 

import java.awt.AWTException;

 

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

 

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

 

public class RoboMouseEvents {

 

    public static void main(String[] args) throws AWTException, InterruptedException {
        // TODO Auto-generated method stub
    	System.setProperty("webdriver.edge.driver", "C:\\ShiftGear\\Drivers\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
        driver.get("https://www.foundit.in/seeker/registration");
        
        WebElement clickC = driver.findElement(By.xpath("//span[text()='Choose CV']"));
        clickC.click();
        
        
        Robot robo = new Robot();
        Dimension dim = driver.manage().window().getSize();

        //get width and height
        System.out.println("Dimensions x and y: " + dim.getWidth() +" " + dim.getHeight());

        //adjusting the dimensions to locate x and y co-ordinates
        int x = (dim.getWidth()/4);
        int y = (dim.getHeight()/10)+50;

        robo.mouseMove(x, y);

        robo.delay(3000);
        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);//Button 1 is left mouse button so its left click
        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);


        robo.delay(3000);
        robo.keyPress(KeyEvent.VK_ENTER);
        robo.delay(3000);
        robo.keyRelease(KeyEvent.VK_ENTER);
}
}