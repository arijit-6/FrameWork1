package TestSute1;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.FlightRatesPage;
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
		
		driver.manage().window().maximize();
		
		
		
	}
	
	
	@Test
	public void SearchFlights_Test() throws IOException, InterruptedException
	{
		
		Utility ut = new Utility(driver);
		
		//rd = new ReadData();
		
		HashMap<String,String> tc = ReadData.PassDataToTestCase(System.getProperty("user.dir")+"\\src\\main\\java\\Data\\TestSuite1\\Data.xlsx","Sheet1","SearchFlights");
		
		ut.enterText(HomePageSpiceJet.fromDestination,tc.get("FromDestination"));
		
		
		ut.enterText(HomePageSpiceJet.toDestination,tc.get("ToDestination"));
		
		
		ut.selectDate(HomePageSpiceJet.calenderMonth,tc.get("Month"),HomePageSpiceJet.nextButton,HomePageSpiceJet.dates,tc.get("Date"));
		
		//By month, String textMonth, By nextbutton,By date, String textDate
		
		ut.click(HomePageSpiceJet.search);
		
		
	     Thread.sleep(5000L);	
	     
	     if(ut.getNumberOfElements(FlightRatesPage.flightIcon)==ut.getNumberOfElements(FlightRatesPage.flightTimings))
	     {
	    	 
	    	 
	    	 System.out.println("passed the test");
	    	 
	     }
	
		
	}
	
	
	
	

}
