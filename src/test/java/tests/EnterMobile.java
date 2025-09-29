package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.ProductPage;
import utils.ListenerClass;
import utils.RetryLogicClass;
@Listeners(ListenerClass.class)
public class EnterMobile extends BaseClass {

	@Test(retryAnalyzer=RetryLogicClass.class,groups= {"sanity"})
	public void proceedForMobileNo() throws InterruptedException {
	HomePage h= new HomePage(driver);
	h.searchProduct();	
	h.clickOnProduct();
	h.windowHandle();
	
	ProductPage p= new ProductPage(driver);	
	p.enterPincode();
	p.addToCart();

	CartPage c= new CartPage(driver);	
	c.proceedToCheckout();
	
	CheckoutPage c1= new CheckoutPage(driver);	
  	c1.enterMobileNumber();
  	Thread.sleep(3000);
	String url2= driver.getCurrentUrl();
	Assert.assertEquals(url2, "https://www.hopscotch.in/w/checkout/verify-mobile");

	}
}
