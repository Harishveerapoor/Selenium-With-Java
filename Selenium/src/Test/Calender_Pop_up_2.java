package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Pop_up_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
		driver.get("https://www.yatra.com/");
 // Type 1
		driver.findElement(By.id("BE_flight_origin_date")).click();

        Thread.sleep(4000);
        driver.findElement(By.id("26/01/2024")).click();
//// Type 2        
        driver.navigate().refresh();

        Thread.sleep(4000);
        driver.findElement(By.id("BE_flight_origin_date")).sendKeys("26/01/2024");
       
	}

}
