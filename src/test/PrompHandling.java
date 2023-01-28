package test;



import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PrompHandling {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.edge.driver", "C:\\ShiftGear\\Drivers\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		
		
		WebElement prompt1 = driver.findElement(By.id("alertButton"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",prompt1);
		Alert prompAlert1 = driver.switchTo().alert();
		System.out.println(prompAlert1.getText());
		prompAlert1.accept();
		
		
		WebElement prompt2 = driver.findElement(By.id("alertButton"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",prompt2);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		Alert alert2 = wait.until(ExpectedConditions.alertIsPresent());
        //Alert prompAlert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.accept();
		
		
		WebElement prompt3 = driver.findElement(By.id("alertButton"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",prompt3);
		Alert prompAlert3 = driver.switchTo().alert();
		System.out.println(prompAlert3.getText());
		prompAlert3.accept();
		//System.out.println(driver.findElement(By.id("confirmResult")).getText());
				
		
		WebElement prompt4 = driver.findElement(By.id("promtButton"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",prompt4);
		Alert prompAlert4 = driver.switchTo().alert();
		System.out.println(prompAlert4.getText());
		prompAlert4.sendKeys("Rajendra Babu");
		prompAlert4.accept();
		System.out.println(driver.findElement(By.id("promptResult")).getText());
		
		
		driver.quit();
				
		
		
				
	}
}