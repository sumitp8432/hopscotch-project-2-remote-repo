package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProductPage;
import utils.ListenerClass;
import utils.RetryLogicClass;
@Listeners(ListenerClass.class)
public class EnterPin extends BaseClass{
	@Test(retryAnalyzer=RetryLogicClass.class,groups= {"sanity"})
	public void enterPinMethod() throws InterruptedException {
		HomePage h= new HomePage(driver);
    	h.searchProduct();	
    	h.clickOnProduct();
    	h.windowHandle();
    	
    	ProductPage p= new ProductPage(driver);	
    	String url= driver.getCurrentUrl();
    	Assert.assertEquals(url, "https://www.hopscotch.in/product/1264420/unisex-black-graphic-print-athletic-shoes");
    	p.enterPincode();
    	p.addToCart();
    	
    	

	}
}
