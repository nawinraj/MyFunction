package org.sap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIGNESH\\workspace\\Sel2\\ref\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		
		//Thread.sleep(5000);
		//driver.close();
//		WebElement fbbox = driver.findElement(By.id("email"));
//		fbbox .sendKeys("Nawinraj34@gmail.com");
//		
//		WebElement fbpassbox = driver.findElement(By.id("pass"));
//		fbpassbox.sendKeys("elfjfm12");
//		
//		WebElement lgbutton = driver.findElement(By.id("u_0_2"));
//		lgbutton.click();
		
		WebElement fbtxt = driver.findElement(By.xpath("//input[@type='email']//input[@type='email']"));
		fbtxt.sendKeys("Naveen");
		
		
		
		
		
		
	}
}
