package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	   public static WebDriver driver;
	    @BeforeMethod(alwaysRun=true)
	    public void setBrowser() throws InterruptedException {
	 	   ChromeOptions options = new ChromeOptions();
		   options.addArguments("--headless");
//		   options.addArguments("--window-size=1920,1080");  // ✅ ensures desktop layout
			driver = new ChromeDriver(options);
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
