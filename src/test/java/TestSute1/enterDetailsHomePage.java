package TestSute1;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;




import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.HomePageSpiceJet;
import Utilities.ReadData;
import Utilities.Utility;
import BaseClass.LaunchBrowser;

public class enterDetailsHomePage  {
	
	public static WebDriver driver;
	
	public ReadData rd;
	
	
	@BeforeMethod
	public void OpenURL() throws IOException
	{
		
		driver = LaunchBrowser.launchURL();
		
		driver.get("https://www.spicejet.com/");
		
		
		
	}
	
	
	@Test
	public void enter_Values_FromDestination_Test() throws IOException
	{
		
		Utility ut = new Utility(driver);
		
		//rd = new ReadData();
		
		HashMap<String,String> tc = ReadData.PassDataToTestCase(System.getProperty("user.dir")+"\\src\\main\\java\\Data\\TestSuite1\\Data.xlsx","Sheet1","enterDetailsHomePage");
		
		ut.enterText(HomePageSpiceJet.fromDestination,tc.get("Destination"));
		
		
		
		
	}
	
	
	
	

}
