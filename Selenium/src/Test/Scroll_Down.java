package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Down {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win33\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
		driver.get("https://www.spicejet.com/");

		JavascriptExecutor jr=(JavascriptExecutor)driver;
		jr.executeScript("window.scrollBy(0,1025)", "");
		
		Thread.sleep(3000);
		
		jr.executeScript("window.scrollBy(0,-1025)", "");
		// type 2
		WebElement ele= driver.findElement(By.xpath("//div[text()='Connect with us']"));
		jr.executeScript("arguments[0].scrollIntoView();", ele);
	}

}
