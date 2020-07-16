package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	WebDriver driver;
	
	
	public Utility(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	
	public void enterText(By text,String name)
	{
		
		driver.findElement(text).sendKeys(name);
		
		
	}
	
	public void click(By element)
	{
		
		driver.findElement(element).click();
		
	}

}
