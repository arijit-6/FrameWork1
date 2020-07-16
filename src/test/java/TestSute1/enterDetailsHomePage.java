package TestSute1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.HomePageSpiceJet;
import Utilities.Utility;
import BaseClass.LaunchBrowser;

public class enterDetailsHomePage  {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void OpenURL() throws IOException
	{
		
		driver = LaunchBrowser.launchURL();
		
		
		
	}
	
	
	@Test
	public void enter_Values_FromDestination_Test()
	{
		
		Utility ut = new Utility(driver);
		
		ut.enterText(HomePageSpiceJet.fromDestination, "mum");
		
		
		
	}
	
	
	
	

}
