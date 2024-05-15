package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageOnLoad_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win33\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		WebElement web= driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credentials.')] "));
      String str=  web.getText();
      System.out.println(str);
      
      driver.close();
        
	}

}
//p[contains(text(),'     Congratulations! You must have the proper credentials.   ')]