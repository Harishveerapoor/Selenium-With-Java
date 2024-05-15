package Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
		driver.get("https://www.selenium.dev/");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File sc=ts.getScreenshotAs(OutputType.FILE);
    //    FileHandler.copy(sc, new File("C:\\Batch22\\Selenium\\src\\Test\\ScreenShot.png"));
		FileHandler.copy(sc, new File("C:\\Batch22\\Selenium\\src\\Test\\sgre"));
		
		
      //  file:///C:/Batch22/Selenium/src/Test/ScreenShot.png
		
	}

}
