package Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindoHandel_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win33\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
		driver.get("https://www.spicejet.com/");
		
		WebElement spice=driver.findElement(By.xpath("//div[text()='SpiceHolidays']"));
		spice.click();
		
		Set<String> allhandles = driver.getWindowHandles();
		Iterator<String> itr =allhandles.iterator();
		String parent =itr.next();
		String child=itr.next();
		System.out.println("parent handle"+parent);
		System.out.println("child handle"+child);
		
		driver.switchTo().window(child);
		
		WebElement page=driver.findElement(By.xpath("//img[@title='Srinagar']"));
		String pageonchild=page.getText();
		System.out.println("text taht page is "+pageonchild);
		
		driver.switchTo().window(parent);
		
        
		
	}

}
