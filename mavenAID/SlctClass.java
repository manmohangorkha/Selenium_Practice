package mavenAID;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SlctClass {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver roko = new ChromeDriver();
		roko.manage().window().maximize();
		String URL = "https://www.passportindia.gov.in/AppOnlineProject/welcomeLink#";
		roko.get(URL);
		
//		WebElement f1= roko.findElement(By.name("dcdrLocation"));
//		
//		Select t1 = new Select(f1);
//		
//		t1.selectByVisibleText("Ahmedabad");
//		Thread.sleep(3000);
//		t1.selectByValue("4");
//		Thread.sleep(3000);
		
		WebElement f2 = roko.findElement(By.xpath("//select[@id='country']"));	
		Select so2 = new Select(f2);
		
		so2.selectByVisibleText("Iran");
		
//		
//		roko.close();
//		
		
		
	}

}
