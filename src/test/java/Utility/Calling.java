package Utility;

public class Calling {
	
	public static void main (String[]args) throws InterruptedException
	{
		//browser launch
		
				Object[] input1=new Object[2];
				input1[0]="webdriver.chrome.driver";
				input1[1]="D:\\\\dhana\\\\Automation support\\\\chromedriver.exe";
				SeleniumOperations.browserLaunch(input1);
			
				//open app
				Object[] input2=new Object[1];
				input2[0]="http://primusbank.qedgetech.com/";
				SeleniumOperations.openApp(input2);
				
				//send data to browser for login
				
				Object[] input3=new Object[2];
				input3[0]="//*[@id='txtuId']";
				input3[1]="Admin";
				SeleniumOperations.sendText(input3);
				
				Object[] input4=new Object[2];
				input4[0]="//*[@id='txtPword']";
				input4[1]="Admin";
				SeleniumOperations.sendText(input4);		
				
				Object[] input5=new Object[1];
				input5[0]="//input[@id='login']";
				SeleniumOperations.ClickElement(input5);
				//SeleniumOperations.sendText("//*[@id='txtuId']","Admin");
				//SeleniumOperations.sendText("//*[@id='txtPword']","Admin");
				
				//SeleniumOperations.ClickElement("//input[@id='login']");
			
	}
}
