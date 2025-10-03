package pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	
	@FindBy(css="a.search.search-icon")
	WebElement searchIcon;
	
	@FindBy(xpath="(//input[@placeholder='Search for products'])[3]")
	WebElement searchBox;
	
	@FindBy(xpath="(//img[@class=\"plp-image ng-isolate-scope\"])[1]")
	WebElement productClick;
	
	public void searchProduct(){
		searchIcon.click();
		searchBox.sendKeys("shoe",Keys.ENTER);
	}
	
	public void clickOnProduct() {
		productClick.click();
	}
	
	public void windowHandle() throws InterruptedException {
	Thread.sleep(3000);
	Set<String> e= driver.getWindowHandles();
	Iterator<String> it =e.iterator();
	String parentId = (String) it.next();
	System.out.println(parentId);
	String childId =(String) it.next();
	System.out.println(childId);
	driver.switchTo().window(childId);
	}
	public HomePage(WebDriver driver) {// getting driver from test class 
		this.driver=driver;// Initialize class WebDriver driver by driver parameter
		PageFactory.initElements(driver, this);
	}


}
