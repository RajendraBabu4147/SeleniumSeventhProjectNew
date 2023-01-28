package test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyFirstAutomationScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrom.driver", "C:\\ShiftGear\\Drivers\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		
		
		
		//System.setProperty("webdriver.gecko.driver", "C:\\ShiftGear\\Drivers\\geckodriver.exe");
		
		//WebDriver driver = new GeckoDriver();
		
		
		System.setProperty("webdriver.edge.driver", "C:\\ShiftGear\\Drivers\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://adactinhotelapp.com/");
				
		/*driver.navigate().to("https://www.google.com/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.quit();
		*/
		
		WebElement uName = driver.findElement(By.id("username"));
		uName.sendKeys("Rajendrababu07");
		
		driver.findElement(By.id("password")).sendKeys("Password@07");
		
		//Click n the register link by class
        //driver.findElement(By.cssSelector(".login_register")).click();
        
        //Click n the login button link by tag and id
        //driver.findElement(By.cssSelector("input#login")).click();
        
        //Click n the login button link by tag and class
        //driver.findElement(By.cssSelector("input.login_button")).click();
        
        //Click n the login button link by tag and name attribute
        //driver.findElement(By.cssSelector("input[name=login]")).click();

		//Click n the login button link by tag and class and 'type' attribute
        //driver.findElement(By.cssSelector("input.login_button[type=Submit]")).click();
        
		//Click n the login button link by tag and class and 'value' attribute
		driver.findElement(By.cssSelector("input.login_button[value=Login]")).click();
		
		/*
		new Select(driver.findElement(By.className("search_combobox"))).selectByValue("Sydney");
		
		
		new Select(driver.findElement(By.id("hotels"))).selectByValue("Hotel Creek");
		
		new Select(driver.findElement(By.id("room_type"))).selectByValue("Delux");
		 */
		
		new Select(driver.findElement(By.id("location"))).selectByValue("Melbourne");
        new Select(driver.findElement(By.id("hotels"))).selectByValue("Hotel Sunshine");
        new Select(driver.findElement(By.id("room_type"))).selectByValue("Super Deluxe");
        new Select(driver.findElement(By.id("room_nos"))).selectByValue("2");
        WebElement checkinDate = driver.findElement(By.id("datepick_in"));
        checkinDate.clear();
        checkinDate.sendKeys("24/12/2022");
        //driver.findElement(By.id("datepick_out")).clear();
        WebElement checkoutDate = driver.findElement(By.id("datepick_out"));
        checkoutDate.clear();
        checkoutDate.sendKeys("27/12/2022");
        new Select(driver.findElement(By.id("adult_room"))).selectByValue("2");
        new Select(driver.findElement(By.id("child_room"))).selectByValue("1");
        driver.findElement(By.id("Submit")).click();
        driver.findElement(By.id("radiobutton_0")).click();
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.className("login_title"));
        driver.findElement(By.id("first_name")).sendKeys("Rajendra");
        driver.findElement(By.id("last_name")).sendKeys("Babu");
        driver.findElement(By.id("address")).sendKeys("Bangalore,Karnataka");
        driver.findElement(By.id("cc_num")).sendKeys("4534567487652345");
        new Select(driver.findElement(By.id("cc_type"))).selectByValue("VISA");
        new Select(driver.findElement(By.id("cc_exp_month"))).selectByValue("6");
        new Select(driver.findElement(By.id("cc_exp_year"))).selectByValue("2022");
        driver.findElement(By.id("cc_cvv")).sendKeys("456");
        driver.findElement(By.id("book_now")).click();
       
        
       /* try {
            Thread.sleep(10000);
            }
            catch (Exception e) {

            }
        */
        
        //Implicit wait
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
      //Fluent wait
        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30)) //wait for 30 sec max
                .pollingEvery(Duration.ofSeconds(2)) //checks element every 2 sec
                .ignoring(NoSuchElementException.class); //ignore no such element exception if element not found during polling



       WebElement itButton = fluentWait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("my_itinerary")));
       
         itButton.click();
        
        //driver.findElement(By.id("my_itinerary")).click();
        
        //Explicit wait
        
       // WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        
        //WebElement Logout_button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("ids[]")).click());
        
        
       driver.findElement(By.name("ids[]")).click();

    driver.quit();
	
		
		}

}
	