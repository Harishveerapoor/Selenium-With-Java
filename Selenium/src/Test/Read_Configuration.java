package Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Configuration {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prt=new Properties();
		FileInputStream ipl= new FileInputStream("C:\\Batch22\\Selenium\\src\\Test\\Conifiguration.properties");
		prt.load(ipl);
		
	String url=	prt.getProperty("url");
	System.out.println(url);
	
//	type 2
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win33\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
	driver.get(url);
		

	}

}
