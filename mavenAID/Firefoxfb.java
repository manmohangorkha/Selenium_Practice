package mavenAID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxfb {

	public static void main(String[] args) throws InterruptedException
	
	{
	     WebDriver ice = new FirefoxDriver();
	     
	     Thread.sleep(2000);
	     ice.get("https://www.amazon.in");
	     Thread.sleep(2000);
	    ice.close();
	    Thread.sleep(2000);

	}

}
