package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class youtubeskippbutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win33\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
		

		 driver.get("https://www.youtube.com/watch?v=lkPqPqJCElE");

         driver.findElement(By.xpath("//button[@title='Play']")).click();
		 
		 driver.findElement(By.xpath("//div[text()='Skip']")).click();
		  
		 Thread.sleep(10);

       
		  
		   

		 
	}

}
