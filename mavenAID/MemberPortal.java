package mavenAID;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MemberPortal {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver mp = new ChromeDriver();
		mp.manage().window().maximize();
		mp.get("https://appa--appafull.sandbox.my.site.com/LightningMemberPortal/s/");
		Thread.sleep(2000);
	  WebElement f1=	mp.findElement(By.xpath("//input[@placeholder='Username']"));
	  f1.sendKeys("test.patch47@mailinator.com");
	  WebElement f2=	mp.findElement(By.xpath("//input[@placeholder='Password']"));
	 f2.sendKeys("Mona@1999");
	  WebElement f3=	mp.findElement(By.xpath("//button[@class='slds-button slds-button--brand loginButton uiButton--none uiButton']"));
	  f3.click();
	  Thread.sleep(6000);
	  WebElement f4=	mp.findElement(By.xpath("//a[@href='https://appa--appafull.sandbox.my.site.com/LightningMemberPortal/s/events']"));
			  f4.click();
	  
		
		
		

	}

}
