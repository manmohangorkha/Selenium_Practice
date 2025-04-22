package mavenAID;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class openfb {

	public static void main(String[] args) throws InterruptedException {
		WebDriver  sahil = new FirefoxDriver();
		
	
		sahil.get("https://test.salesforce.com");
		sahil.manage().window().maximize();
		Thread.sleep(500);
		
		sahil.findElement(By.id("username")).sendKeys("manabendra.appa@hytechpro.com.appafull");
		Thread.sleep(500);
		sahil.findElement(By.name("pw")).sendKeys("Htp@ppa4321");
		Thread.sleep(1000);
		sahil.findElement(By.className("r4")).click();
	
		Thread.sleep(1000);
		sahil.findElement(By.id("Login")).click();
		
//		sahil.close();

	
		

	}

}
