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
	
	public static WebDriver launchURL() throws IOException
	{
		
		
	
		
		
          prop = new Properties();	
          
          fls = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\config.properties");
          
          prop.load(fls);
          
          if(prop.getProperty("browser").equals("chrome"))
          {
        	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\src\\main\\java\\Drivers\\chromedriver.exe");
        	  
        	  driver = new ChromeDriver();
        	  
        	  
        	  
        	  
          }
        			  
          
          
         
		
	    
		
		  
		  
		  return driver;
		  
		  
		  
		  
		  
		
		  
		  
		
		 
		
	}
	
	

}
