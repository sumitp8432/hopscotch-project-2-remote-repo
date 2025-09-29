package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

	WebDriver driver;
	@FindBy(xpath="//input[@label=\"Your mobile number\"]")
	WebElement enterMobileNo;
	
	@FindBy(xpath="//button[@class=\" btn  btn-primary \"]")
	WebElement clickOnContinue;
	
	public void enterMobileNumber(){
		enterMobileNo.sendKeys("8009900785");
		clickOnContinue.click();
		}
	
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
