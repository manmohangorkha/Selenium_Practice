package mavenAID;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class p1 {
	
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver dc = new ChromeDriver();
		dc.manage().window().maximize();
		String url = "https://www.meesho.com/";
		dc.get(url);
		Thread.sleep(6000);
		WebElement face = dc.findElement(By.linkText("Beauty & Health"));				
		Actions act = new Actions(dc);
		act.moveToElement(face).build().perform();
	    
	  
	}

}
