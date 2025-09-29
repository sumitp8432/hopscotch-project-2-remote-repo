package utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import tests.BaseClass;

public class ScreenshotClass {
	public static void screenshot() {
		TakesScreenshot ts = (TakesScreenshot) BaseClass.driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		int number=(int) (Math.random()*100);
		File destination = new File("C:\\Users\\Sumit\\eclipse-workspace\\project2\\ScreenShotFolder2\\fail"+number+".jpg");
		
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
