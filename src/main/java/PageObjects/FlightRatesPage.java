package PageObjects;

import org.openqa.selenium.By;

public class FlightRatesPage {
	
	
	//using the below xpath you check the number of flights available
	
	public static By flightIcon = By.xpath("//span[@class='flight_icon1']");
	
	
	
	public static By flightTimings = By.xpath("//*[@class='hide-below-480'] //div[contains(@class,'arrival-time')]");
	
	

}
