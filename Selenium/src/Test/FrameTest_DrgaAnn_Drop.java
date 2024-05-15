package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest_DrgaAnn_Drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement ele= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(ele);
		System.out.println("it will help switch the curser to frame");
		 Thread.sleep(3000);

	    WebElement web1=	driver.findElement(By.id("draggable"));
	    WebElement web2=	driver.findElement(By.id("droppable"));
	
        Thread.sleep(3000);
   
	    Actions cls= new Actions(driver);
	    cls.dragAndDrop(web1, web2).build().perform();
	
	}

}
