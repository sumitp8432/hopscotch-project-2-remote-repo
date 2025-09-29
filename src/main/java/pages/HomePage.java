package pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	@FindBy(xpath="//a[@class=\"search search-icon\"]")
	WebElement searchIcon;
	
	@FindBy(xpath="(//input[@type=\"search\"])[3]")
	WebElement searchBox;
	
	
	@FindBy(xpath="(//img[@class=\"plp-image ng-isolate-scope\"])[2]")
	WebElement productClick;
	
	public void searchProduct(){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(searchIcon));
		searchIcon.click();
		searchBox.sendKeys("shoe",Keys.ENTER);
	}
	
	public void clickOnProduct() {
		productClick.click();
	}
	
	public void windowHandle() throws InterruptedException {
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
