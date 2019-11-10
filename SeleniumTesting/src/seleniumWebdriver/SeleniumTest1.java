package seleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest1 {

	public static void main(String[] args) throws Exception 
	{
System.out.println("Test Start");
		
		//Run chromedriver.exe to get chrome browser
		System.setProperty("webdriver.chrome.driver","/home/tush/Videos/chromedriver_linux64/chromedriver");
				
		//create object to access chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.co.in");
		driver.manage().window().maximize();
	
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("abdul kalam");
		//driver.close();
		System.out.println("Test End");

	}

}
