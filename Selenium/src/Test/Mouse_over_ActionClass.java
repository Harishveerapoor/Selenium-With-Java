package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_over_ActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win33\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
		driver.get("https://www.spicejet.com/");
		
		WebElement ele= driver.findElement(By.xpath("//div[text()='Add-ons']"));
		
		Actions cls= new Actions(driver);
		cls.moveToElement(ele).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='You-1st']")).click();

	}

}
