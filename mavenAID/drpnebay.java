package mavenAID;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class drpnebay {

	public static void main(String[] args) throws InterruptedException{
	WebDriver  safe = new ChromeDriver();
	safe.manage().window().maximize();
	
	String url = "https://www.ebay.com/";
	safe.get(url);
	  WebElement drdn = safe.findElement(By.xpath("//select[@aria-label='Select a category for search']"));
	  Select drpsl = new Select(drdn);
	  drpsl.selectByVisibleText("Art");
	  Thread.sleep(3000);
	  
	  safe.close();
	
	
	
	
	
	
	}

}
