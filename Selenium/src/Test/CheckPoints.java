package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*                CHECK POINTS 
                
            1] URL   Check point
            2] TITLE Check point
            3] TEXT  Check point
*/	
		
		
//    		              1] URL   Check point
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		String Expectedurl ="https://www.spicejet.com/";
		driver.get(Expectedurl);
		
		String currenturl=driver.getCurrentUrl();  // // String currenturl = "https://www.spicejet.com/";
		if (Expectedurl.equals(currenturl)) {
			
		System.out.println("print is corect url");
		}
		else {
			System.out.println(" is not corect url");
		}
		
//		 2] TITLE Check point
		
		String Expectedtitle="SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
		 String curenttile=driver.getTitle();
		 
		 if(Expectedtitle.equals(curenttile)) {
			 System.out.println("print is corct title");
		 }
		 else {
			 System.out.println("print is not corrct");
		 }
		
//        3] TEXT  Check point	
		 
		    driver.findElement(By.xpath("//div[text()='Login']")).click();
			driver.findElement(By.xpath("//input[@data-testid='user-mobileno-input-box']")).sendKeys("9353804347");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Harish@6");
			driver.findElement(By.xpath("//div[@data-testid='login-cta']")).click();
			
		 String expectedtext=driver.findElement(By.xpath("//div[text()='Hi Harish']")).getText();
		  if(expectedtext.equals("hi harish"));{
			  System.out.println("is corect text");
			  }
		 
		  
		  }
		  
		  
		  
		 
		
		
	}


