package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.HomePage;
import utils.ListenerClass;
import utils.RetryLogicClass;
@Listeners(ListenerClass.class)
public class SearchProduct extends BaseClass {
	@Test(retryAnalyzer=RetryLogicClass.class,groups= {"smoke"})
	public void productMethod() throws InterruptedException {
    	String url= driver.getCurrentUrl();
    	Assert.assertEquals(url, "https://www.hopscotch.in/");
    	HomePage p= new HomePage(driver);// passing argument driver from base class
    	p.searchProduct();	
    	

	}
}
