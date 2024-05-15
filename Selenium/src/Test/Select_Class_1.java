package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Class_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	/*	thier are 4 tpes
		1] select an option or select multi option
        2]delet option
        3] all available option
        4] get all selected option
  */
		//1] select an option
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win33\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
		driver.get("file:///C:/Users/USER/Downloads/sample%20(1).html");
		
		WebElement web= driver.findElement(By.id("city"));
		
		Select sel =new Select(web);
		Thread.sleep(3000);
		sel.selectByIndex(1);
		Thread.sleep(3000);
		sel.selectByValue("4");
		Thread.sleep(3000);
		sel.selectByVisibleText("Bangalore");
		Thread.sleep(3000);
		
		// 4] get all select options;
	List<WebElement> we =  sel.getOptions();
	for(int i=0; i<we.size();i++) {
		WebElement ele=we.get(i);
		System.out.println(ele.getText());
	}
		
	}

}
