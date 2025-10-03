package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {

	WebDriver driver;
	@FindBy(xpath="//input[@label=\"Your mobile number\"]")
	WebElement enterMobileNo;
	
	@FindBy(xpath="//button[text()='Continue']")
	WebElement clickOnContinue;
	
	public void enterMobileNumber(){
		enterMobileNo.sendKeys("8009900785");
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Continue']"))).click();
//		clickOnContinue.click();
		WebElement continueButton = driver.findElement(By.xpath("//button[text()='Continue']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", continueButton);
		}
	
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
