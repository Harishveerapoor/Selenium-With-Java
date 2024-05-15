package Test;

import java.awt.Desktop.Action;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.WebElementHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeSetClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win33\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		// login page
//		driver.findElement(By.xpath("//span[text()='Login']")).click();
//		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9353804347");
//		driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
		
		// browsernavigation
		
//		driver.findElement(By.xpath("(//img[@class='_2puWtW _3a3qyb'])[2]")).click();
//		Thread.sleep(3000);
//		driver.navigate().back();
//		Thread.sleep(3000);
//		driver.navigate().forward();
//		Thread.sleep(3000);
//		driver.navigate().refresh();
//		driver.navigate().to("https://www.flipkart.com/");
		
		
		// check points
		
//	String str1="https://www.flipkart.com/";
//	driver.get(str1);
//	String str2=driver.getCurrentUrl();
//	if(str1.equals(str2)) {
//		System.out.println("yes");
//	}
//	else {
//		System.out.println("no");
//	}
//		
//	String str3="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
//	String str4=driver.getTitle();
//	if(str3.equals(str4)) {
//		System.out.println("yesssss");
//	}
//	else {
//		System.out.println("nooooo");
//	}
//	
//	driver.findElement(By.xpath("//img[@alt='TVs & Electronics']")).click();
//		
//	String str5=driver.findElement(By.xpath("//h1[text()='Sale is Live - Electronics Store']")).getText();
//	if(str5.equals("Sale is Live - Electronics Store")) {
//		System.out.println("yesoooooo");
//	}
//	else {
//		System.out.println("noooooonoooo");
//	}
	
	// explicitWait
	
//	  driver.findElement(By.xpath("//span[text()='Login']")).click();
//	  driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9353804347");
//    WebElement ele=	driver.findElement(By.xpath("//button[text()='Request OTP']"));
//    WebDriverWait wait=new WebDriverWait(driver, 60);
//    wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
//    

		
		// select classess

//	driver.get("file:///C:/Users/USER/Downloads/sample%20(1).html");
//	WebElement web= driver.findElement(By.id("city"));
	
//	Select  cls= new Select(web);
//	Thread.sleep(3000);
//	cls.selectByVisibleText("Bangalore");
//	Thread.sleep(3000);
//	cls.selectByIndex(3);
//	Thread.sleep(3000);
//	cls.selectByValue("2");
//	
//	List<WebElement> set= cls.getOptions();
//	for(int i=0;i<set.size();i++) {
//	WebElement el=	set.get(i);
//	System.out.println(el.getText());
//		
	
//	WebElement web= driver.findElement(By.id("cities"));
//	Select sel=new Select(web);
//	Thread.sleep(3000);
//	sel.selectByIndex(1);
//	Thread.sleep(3000);
//	sel.selectByVisibleText("Bangalore");
//	Thread.sleep(3000);
//	sel.selectByValue("3");
//	
//	List<WebElement> ele= sel.getAllSelectedOptions();
//	for(int i=0; i<ele.size();i++) {
//	WebElement se=	ele.get(i);
//	System.out.println(se.getText());
//
//	Thread.sleep(3000);
//	sel.deselectByVisibleText("Bangalore");
	
//	}
	
	// calendor popup
	
//	  driver.get("https://www.redbus.com/");
//    WebElement ele=	driver.findElement(By.className("//label[text()=' date']"));
//    ele.click();
//	  Thread.sleep(3000);
//	  driver.findElement(By.id("26/01/2024")).click();
//	
	 
		
		// alertpopup
		
//		driver.get("https://demo.guru99.com/test/delete_customer.php");
//		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("90088");
//   	WebElement web=	driver.findElement(By .xpath("//input[@name='submit']"));
//  	web.click();
//		
//	    Alert alt=driver.switchTo().alert();
//	    alt.dismiss();
//	    Thread.sleep(3000);
//	    web.click();
//	    Thread.sleep(3000);
//	    alt.accept();
//	    Thread.sleep(3000);
//	    alt.accept();
		
		// file upload
//		
//		driver.get("file:///C:/Users/USER/Downloads/sample%20(1).html");
//		driver.findElement(By.id("brow")).sendKeys("C:\\Users\\USER\\Downloads\\HAREESH RESUME__ (2).pdf");
		
		//draganddroppeble
		
//		driver.get("https://jqueryui.com/droppable/");
//	    WebElement es=	driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(es);
//   	WebElement ele=	driver.findElement(By.id("draggable"));
//	    WebElement ele2=	driver.findElement(By.id("droppable"));
//	 	
//	    Actions cls= new Actions(driver);
//	    cls.dragAndDrop(ele, ele2).build().perform();
//	
		
		
		// mouseoveraction
		
		
//		WebElement web= driver.findElement(By.xpath("//span[text()='Login']"));
//		Actions cls=new Actions(driver);
//		cls.moveToElement(web).build().perform();
//		driver.findElement(By.xpath("(//li[@class='AT0fUR'])[3]")).click();
//	
		
		//pageonhload
//		
//		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
//	WebElement web=	driver.findElement(By.xpath("//p[contains(text(),' Congratulations! You must have the proper credentials.')]"));
//	String ele= web.getText();
//	System.out.println(ele);
//	driver.close();
//		
//		
		// read configaration
		
//		Properties pr=new Properties();
//		FileInputStream st=new FileInputStream("C:\\Batch22\\Selenium\\src\\Test\\cosine.properties");
//		pr.load(st);
//		String st6r=pr.getProperty("url");
//		
//		System.out.println(pr.getProperty(st6r));
//		driver.get(st6r);
		
		//scrolldownmethod
//		
//		JavascriptExecutor jr=(JavascriptExecutor)driver;
//		jr.executeScript("window.scrollBy(0,3000)", "");
//		
//	    WebElement web=	driver.findElement(By.xpath("//h2[text()='Flipkart Plus']"));
//		jr.executeScript("arguments[0].scrollIntoView();", web);
//		
		// windowhandle
//		
//		driver.get("https://www.spicejet.com/");
//		
//		WebElement ele=driver.findElement(By.xpath("//div[text()='SpiceHolidays']"));
//		ele.click();
//		
//	   Set<String>	 ele3=driver.getWindowHandles();
//     Iterator<String> itr=	ele3.iterator();
//     String parent=  itr.next();
//     String child= itr.next();
//     System.out.println("hi haleo"+parent);
//     System.out.println("hi haleo"+child);
//	   driver.switchTo().window(child);
//		
//		
//	  WebElement web=	driver.findElement(By.xpath("//img[@title='Srinagar']"));
//    String str=	web.getText();
//    System.out.println("helo"+str);
//    
//    driver.switchTo().window(parent);
		
   
		
		//tooltip
		
		
//		WebElement web=	driver.findElement(By.xpath("(//a[@title='Login'])[1]"));
//        String str=	web.getAttribute("title");
//	    System.out.println("helo"+str);
//		
//		
		
		
	}
	
	

}
