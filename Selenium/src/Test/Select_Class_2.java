package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Class_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win33\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
		driver.get("file:///C:/Users/USER/Downloads/sample%20(1).html");
		
		// 1] multiselect option
		
		WebElement web2= driver.findElement(By.id("cities"));
		
		Select multisel =new Select(web2);
		Thread.sleep(3000);
		multisel.selectByIndex(3);
		Thread.sleep(3000);
		multisel.selectByValue("1");
		Thread.sleep(3000);
		multisel.selectByVisibleText("Chicago");
		Thread.sleep(3000);
		
		//3] get avilable option
         List<WebElement>  ele  =multisel.getAllSelectedOptions();
         for(int i=0;i<ele.size();i++) {
        	WebElement we= ele.get(i);
        	System.out.println(we.getText());
         }

         // 2] deselect option
         
         multisel.deselectByVisibleText("Bangalore");
	}

}
