package Utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
	
	
	
	public void selectDate(By by, String textMonth, By by1, String textDate)
	{
		
		
		while(!driver.findElement(by).equals(textMonth))
		{
			driver.findElement(by1).click();
			
		}
		
		List<WebElement> dates = driver.findElements(by1);
		
		for(int i=0;i<dates.size();i++)
		{
			
			if(dates.get(i).getText().equals(textDate))
			{
				dates.get(i).click();
				
				break;
			}
			
		}
		
		
	}
	
	

}
