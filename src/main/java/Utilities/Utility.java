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
	
	public int getNumberOfElements(By element)
	{
		
		return driver.findElements(element).size();
	}
	
	
	public void click(By element)
	{
		
		driver.findElement(element).click();
		
	}
	
	
	
	public void selectDate(By month, String textMonth, By nextbutton,By date, String textDate)
	{
		
		
		while(!driver.findElement(month).getText().equals(textMonth))
		{
			driver.findElement(nextbutton).click();
			
		}
		
		List<WebElement> dates = driver.findElements(date);
		
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
