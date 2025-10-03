package utils;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import tests.BaseClass;

public class ScreenshotClass {
	public static void screenshot() {
		LocalDateTime now = LocalDateTime.now();
		String dateTime= now.toString();
		String year=dateTime.substring(0, 4);
		String month=dateTime.substring(5, 7);
		String date=dateTime.substring(8, 10);
		String hour=dateTime.substring(11, 13);
		String minute=dateTime.substring(14, 16);
		String second=dateTime.substring(17, 19);
		TakesScreenshot ts= (TakesScreenshot) BaseClass.driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination= new File("D:\\workspace\\hopscotch-project-2\\ScreenShotFolder2\\Screenshot "+" "+year+" "+date+" "+month+" "+hour+" "+minute+" "+second+".jpg");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
