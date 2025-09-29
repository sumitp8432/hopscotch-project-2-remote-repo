package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;
import utils.ListenerClass;
import utils.RetryLogicClass;
@Listeners(ListenerClass.class)
public class ProceedToCheckout extends BaseClass{

	@Test(retryAnalyzer=RetryLogicClass.class,groups= {"sanity"})
	public void proceedCheckout() throws InterruptedException {
		HomePage h= new HomePage(driver);
    	h.searchProduct();	
    	h.clickOnProduct();
    	h.windowHandle();
    	
    	ProductPage p= new ProductPage(driver);	
    	p.enterPincode();
    	p.addToCart();
    	

    	CartPage c= new CartPage(driver);	
    	String title= driver.getTitle();
    	Assert.assertEquals(title, "Hopscotch - Daily finds for babies, kids and moms. Apparel, shoes, toys, bags & more");
    	String url= driver.getCurrentUrl();
    	Assert.assertEquals(url, "https://www.hopscotch.in/w/cart");
    	c.proceedToCheckout();
    	String url1= driver.getCurrentUrl();
    	Assert.assertEquals(url1, "https://www.hopscotch.in/w/checkout/add-mobile");

	}
	
	
}
