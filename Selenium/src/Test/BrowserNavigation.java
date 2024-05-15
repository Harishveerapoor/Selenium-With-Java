package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
		driver.get("https://www.selenium.dev/");
		
	     driver.findElement(By.xpath("//span[text()='Downloads']")).click();
	     Thread.sleep(3000);
	     driver.navigate().back();
	     Thread.sleep(3000);
	     driver.navigate().forward();
	     Thread.sleep(3000);
	     driver.navigate().refresh();
	     Thread.sleep(3000);
	     driver.navigate().to("https://www.selenium.dev/");
         driver.close();
	}

}
