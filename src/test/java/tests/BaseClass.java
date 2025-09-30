package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	   public static WebDriver driver;
	    
	    @BeforeMethod(alwaysRun=true)
	    public void setBrowser() throws InterruptedException {
			driver= new ChromeDriver();
	    	driver.get("https://www.hopscotch.in");
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	
	    }
	    @AfterMethod(alwaysRun=true)
	    public void quitBrowser() throws InterruptedException {
			driver.quit();
			Thread.sleep(3000);
	    }
}
