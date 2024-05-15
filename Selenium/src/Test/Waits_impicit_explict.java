package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits_impicit_explict {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win33\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// impicit wait
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
		
		String url ="https://www.spicejet.com/";
		driver.get(url);
		
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@data-testid='user-mobileno-input-box']")).sendKeys("9353804347");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Harish@6");
		
		// explicit wait
		WebElement subt=driver.findElement(By.xpath("//div[@data-testid='login-cta']"));
		WebDriverWait wait=new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(subt)).click();

	}

}
