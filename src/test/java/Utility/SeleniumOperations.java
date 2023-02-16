package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOperations {
	
	public static WebDriver driver;
	//browser launch
	public static  void browserLaunch(Object[]inputParameters)
	{ 
		try {
			String chrome=(String) inputParameters[0];
			String exe=(String) inputParameters[1];
			System.setProperty(chrome,exe);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		/*try {
			String bname=(String)inputParameters[0];   // chrome
			String exe=(String)inputParameters[1];     // exe location 
			if(bname.equalsIgnoreCase("chrome"))
			   {
			     System.setProperty("webdriver.chrome.driver",exe);
			     driver=new ChromeDriver();
			     driver.manage().window().maximize();
			     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			   }
			else if(bname.equalsIgnoreCase("Firefox"))
			{
				 System.setProperty("webdriver.gecko.driver",exe);
			     driver=new FirefoxDriver();
			     driver.manage().window().maximize();
			     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				
			}
			
			}
			catch(Exception e)
			  {
			     System.out.println(e);
			  }*/
		
		}

	//open application
		public static void openApp(Object[]inputParameters) throws InterruptedException 
		{
			try {
				String path=(String) inputParameters[0];
				driver.get(path);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		
		}
		
		public static void sendText(Object[]inputParameters) {
			
			try {
				String xpath1=(String)inputParameters[0];
				String text=(String)inputParameters[1];
				//driver.findElement(By.xpath("xpath")).sendKeys(text);	
				driver.findElement(By.xpath(xpath1)).sendKeys(text);
			}
			catch(Exception e) {
				System.out.println(e);
			}

		}
		//click 
		public static void ClickElement(Object[]inputParameters)
		{
			try {
				String xpath2=(String)inputParameters[0];
				driver.findElement(By.xpath(xpath2)).click();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		
		public static void Validation(Object[]inputParameters)
		{
				try {
					String input=(String)inputParameters[0];
					String xpath2=(String)inputParameters[1];
					String CaptureText=driver.findElement(By.xpath(xpath2)).getText();
					
				
					if(input.equalsIgnoreCase(CaptureText))
					{
						System.out.println("Test case is pass");
					}
					else {
						
						System.out.println("Test case is pass");	
					}
				} 
				catch(Exception e) {
					System.out.println(e);
				}
	
					
			
		}
		//select method
		
		public static void selectElement(Object[]inputParameters)
		{
				try {
					String xpath1=(String)inputParameters[0];
					String value=(String)inputParameters[1];
					Select sel=new Select(driver.findElement(By.xpath(xpath1)));
					sel.selectByVisibleText(value);
				} 
				catch(Exception e) {
					System.out.println(e);
				}

		}
		public static void AlertHandle()
		{
				try {
			
					Alert abc=(Alert) driver.switchTo().alert();
					abc.accept();
				} 
				catch(Exception e) {
					System.out.println(e);
				}

		}

		
}


