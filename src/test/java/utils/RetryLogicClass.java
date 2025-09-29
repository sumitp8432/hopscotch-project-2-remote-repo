package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogicClass implements IRetryAnalyzer {
	int initialcount=0;
	int retrycount=1;
	
	public boolean retry(ITestResult result) {
		
		if(initialcount<retrycount) {
			
			initialcount++;
			return true;
		}
		
		return false;
	}
}
