package screenshot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotdemo
{
	public static void main(String args[]) throws IOException 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\softwer\\New folder\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://zoom.us/signup");
		 
		 TakesScreenshot sc =(TakesScreenshot)driver;
		 
		 File source=sc.getScreenshotAs(OutputType.FILE);
		// File source = scrshot.getScreenshotAs(OutputType.FILE);
		 
		String path="C:\\Users\\Shubhu\\Desktop\\Capturedscreenshot\\zoommeeting.png";
		
		File destination=new File(path);
		
		//FileHandler.copy(source, destination);
		 FileHandler.copy(source,destination);
		 
		 
	}

}
