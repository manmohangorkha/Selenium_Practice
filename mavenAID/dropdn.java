package mavenAID;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dropdn {

	public static void main(String[] args) throws InterruptedException {
		WebDriver shave = new ChromeDriver();
		shave.manage().window().maximize();
		
		String raat = "https://www.ebay.com/";
		shave.get(raat);		
		
		WebElement uname = shave.findElement(By.xpath("//Select[@aria-label='Select a category for search']"));		
		Select Henri = new Select(uname);
		Henri.selectByIndex(3);
		
		Thread.sleep(2999);
		
		shave.close();
		

	}

}
