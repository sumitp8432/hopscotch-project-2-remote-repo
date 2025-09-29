package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CartPage {
	WebDriver driver;
	@FindBy(xpath="(//button[@class=\" btn  btn-primary \"])[1]")
	WebElement proceedToCheckout;
	
	public void proceedToCheckout() throws InterruptedException{
		proceedToCheckout.click();
		Thread.sleep(3000);
		}
	
	public CartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
