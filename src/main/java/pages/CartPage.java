package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CartPage {
	WebDriver driver;
	@FindBy(xpath="(//button[text()='PROCEED TO CHECKOUT'])[1]")
	WebElement proceedToCheckout;
	
	public void proceedToCheckout() throws InterruptedException{
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", proceedToCheckout);
		Thread.sleep(3000);
	}
	public CartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
