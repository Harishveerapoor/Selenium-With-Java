package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_pop_up_4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("78387");
		WebElement sbt= driver.findElement(By.name("submit"));
		sbt.click();
		Alert alt= driver.switchTo().alert();
	//	System.out.println("the text is"+alt.getText());
		
		Thread.sleep(3000);
		alt.dismiss();
		
		Thread.sleep(3000);
		sbt.click();
		Thread.sleep(3000);
		alt.accept();
		Thread.sleep(3000);
	String str	 =alt.getText();
	System.out.println(str);
		alt.accept();
		
		

	}

}
