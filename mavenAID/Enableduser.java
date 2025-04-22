package mavenAID;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class Enableduser {

	public static void main(String[] args) throws InterruptedException
	{
	WebDriver face = new ChromeDriver();
	face.manage().window().maximize();
	face.get("https://test.salesforce.com");
	face.findElement(By.name("username")).sendKeys("sysadmin@mdnonprofit.org.manofull");
	face.findElement(By.id("password")).sendKeys("MANO@21211!");
	face.findElement(By.cssSelector("input[type='submit']")).click();
	face.findElement(By.cssSelector("a[title='Nonprofit Profile']")).click();
	Thread.sleep(1000);
//	
//	face.findElement(By.cssSelector("button[name='EnableCustomerPortal']")).click();

//	
//	Thread.sleep(1000);
//	
	face.close();

	}

}
