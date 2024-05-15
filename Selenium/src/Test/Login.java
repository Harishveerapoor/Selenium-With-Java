package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
		
		String url ="https://www.spicejet.com/";
		driver.get(url);
		
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@data-testid='user-mobileno-input-box']")).sendKeys("9353804347");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Harish@6");
		driver.findElement(By.xpath("//div[@data-testid='login-cta']")).click();
		
		
	}
	
//	(//html[@atribute='atri value'])[1]
	//html[text()='value']
	//html[contains(text(),'value')]

}
