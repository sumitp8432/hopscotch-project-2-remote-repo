package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	WebDriver driver;
	@FindBy(xpath="//span[@class=\"css-izpffw\"]")
	WebElement clickPincode;
	
	@FindBy(xpath="//input[@class=\"css-kvtl1n\"]")
	WebElement enterPincode;
	
	@FindBy(xpath="//button[text()=\"Check\"]")
	WebElement checkPincode;

	@FindBy(xpath="//button[@class=\"css-1121kz3\"]")
	WebElement addToCart;
	
	@FindBy(xpath="//div[@class=\"css-14v8m7i\"]")
	WebElement sizeDropdown;
	
	@FindBy(xpath="(//div[@class=\"css-1cpc728\"])[1]")
	WebElement selectSize;
	
	@FindBy(xpath="//div[@class=\"css-19zomql\"]")
	WebElement viewCart;
	
	public void enterPincode() throws InterruptedException{
		clickPincode.click();
		enterPincode.sendKeys("560010");
		checkPincode.click();
		Thread.sleep(3000);
		}

	public void addToCart() {
		sizeDropdown.click();
		selectSize.click();					
		addToCart.click();
		viewCart.click();
		}

	
	public ProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
