package BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static WebDriver driver;
	
	public static Properties prop;
	
	public static FileInputStream fls;
	
	public static void main(String [] args) throws IOException
	{
		
		
	//	System.setProperty("webdriver.chrome.driver","C://Program Files//chromedriver.exe");
		
		
          prop = new Properties();	
          
          fls = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\config.properties");
          
          prop.load(fls);
          
          System.out.println(prop.getProperty("url"));
		
	/*	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\src\\main\\java\\Drivers\\chromedriver.exe");
		
		  driver = new ChromeDriver();
		  
		  driver.get("https://www.google.com");
		  
		  
		  
		 */ 
		  
		  
		
		 
		
	}
	
	

}
